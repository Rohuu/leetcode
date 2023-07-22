
import java.util.Arrays;

public class AverageOfAllContiguousSubarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        double[] ans = getNewArrayContainingAverges(arr, 5);
        System.out.println(Arrays.toString(ans));
    }

    static double[] getNewArrayContainingAverges(int[] arr, int k) {
        double[] res = new double[arr.length - k + 1];
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum = sum + arr[j];
                res[i] = (double) sum / k;
            }
        }
        return res;
    }
}
