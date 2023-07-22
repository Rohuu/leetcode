// Qus: https://leetcode.com/problems/max-consecutive-ones-iii/

public class LongestSubarrayWithOnesAfterReplacement {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 };
        System.out.println(longestSubarrayAfterReplacement(nums, 2));
    }

    static int longestSubarrayAfterReplacement(int[] nums, int k) {
        int i = 0;
        int countOfDigitOne = 0;
        int maxLength = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1) {
                countOfDigitOne++;
            }
            while ((j - i + 1) - countOfDigitOne > k) {
                if (nums[i] == 1) {
                    countOfDigitOne--;
                }
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}
