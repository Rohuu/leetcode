import java.util.Arrays;

// Qus: Given an array arr of unsorted numbers and a target sum, count all triplets in it such that 
// arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. 
// Write a function to return the count of such triplets.

public class TripletsWithSmallerSum {

    public static void main(String[] args) {
        int[] arr = { -1, 4, 2, 1, 3 };
        int target = 5;
        int ans = findTriplets(arr, target);
        System.out.println(ans);
    }

    static int findTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        int countTriplets = 0;
        for (int k = 0; k < arr.length - 2; k++) {
            countTriplets = countTriplets + doublesWithSmallerSum(k + 1, arr.length - 1, arr, target - arr[k]);
        }
        return countTriplets;
    }

    static int doublesWithSmallerSum(int i, int j, int[] arr, int target) {
        int countDoubles = 0;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                j--;
            } else if (sum > target) {
                j--;
            } else {
                countDoubles = countDoubles + j - i;
                i++;
            }
        }
        return countDoubles;
    }
}
