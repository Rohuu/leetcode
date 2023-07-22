// Qus: https://leetcode.com/problems/minimum-size-subarray-sum/description/

public class SmallestSubarrayWithAGivenSum {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 4, 0 };
        int S = 2;
        int ans = smallestSubarray(arr, S);
        System.out.println(ans);
    }

    static int smallestSubarray(int[] arr, int S) {
        int i = 0;
        int windowSum = 0;
        int minSubarrayLength = 0;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            windowSum = windowSum + arr[j];

            while (windowSum >= S) {
                windowSum = windowSum - arr[i];
                minSubarrayLength = j - i + 1;
                min = Math.min(minSubarrayLength, min);
                i++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}
