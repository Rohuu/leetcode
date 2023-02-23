// Qus: Given an array arr of unsorted numbers and a target sum, count all triplets in it such that 
// arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. 
// Write a function to return the count of such triplets.

// SubQus: WAP for two numbers first......

public class TwoSumSmallerThanTarget {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 5;
        int ans = doublesWithSmallerSum(0, arr.length - 1, arr, target);
        System.out.println(ans);

    }

    static int doublesWithSmallerSum(int i, int j, int[] arr, int target) {
        int count = 0;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                j--;
            } else if (sum > target) {
                j--;
            } else {
                count = count + j - i;
                i++;
            }
        }
        return count;
    }
}
