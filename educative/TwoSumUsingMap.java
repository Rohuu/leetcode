import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumUsingMap {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,3};
        int[] ans=twoSum(arr,9);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
