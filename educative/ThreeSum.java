import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = { 0, 0, 0 };
        System.out.println(findThreeSum(nums));
    }

    static List<List<Integer>> findThreeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // target?
            // we have picked a, so now by a+b+c=0, we can say b+c= 0-a;

            // find duplicate and call function for non-duplicates only!

            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumSorted(i + 1, nums.length - 1, nums, 0 - nums[i]);
            }
        }
        return res;
    }

    static void twoSumSorted(int i, int j, int[] nums, int target) {
        int a1 = nums[i - 1];
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);

                // duplicate b
                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }

                // duplicate c
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }

                i++;
                j--;
            }
        }
    }

}
