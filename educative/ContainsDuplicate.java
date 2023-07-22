
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        boolean ans = isHavingDuplicateValues(nums);
        System.out.println(ans);
    }

    static boolean isHavingDuplicateValues(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) != 1) {
                return true;
            }
        }
        return false;
    }
}
