public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, -9, -89, -5786, 0, 2, 1, 0, 23, 0 };
        int ans = maximumSum(arr, 5);
        System.out.println(ans);
    }

    static int maximumSum(int[] arr, int k) {
        int i = 0;
        int sum = 0;
        int maxSum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j]; // add the next element
            if (j >= k - 1) {
                if (sum > maxSum) {
                    maxSum = sum;
                }
                sum = sum - arr[i]; // subtract the element going out
                i++; // slide the window ahead
            }
        }
        return maxSum;
    }
}
