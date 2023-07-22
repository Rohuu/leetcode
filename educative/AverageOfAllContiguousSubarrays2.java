
import java.util.Arrays;

// Qus: Given an array, find the average of all contiguous subarrays of size ‘K’ in it.

// Sliding window approach //

public class AverageOfAllContiguousSubarrays2 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        double[] res = getArrrayHavingAverages(arr, 5);
        System.out.println(Arrays.toString(res));
    }

    static double[] getArrrayHavingAverages(int[] arr, int k) {
        double[] res = new double[arr.length - k + 1];
        int windowSum = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            windowSum += arr[j];
            if (j >= k - 1) {
                res[i] = (double) windowSum / k;
                windowSum = windowSum - arr[i];
                i++;
            }
        }
        return res;
    }
}
