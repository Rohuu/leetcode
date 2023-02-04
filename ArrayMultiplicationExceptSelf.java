import java.util.Arrays;

public class ArrayMultiplicationExceptSelf {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = getNewArrayProductExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getNewArrayProductExceptSelf(int[] arr) {
        int[] right = new int[arr.length];
        int mult = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            mult = mult * arr[i];
            right[i] = mult;
        }
        int[] res = new int[arr.length];
        mult = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int lp = mult;
            int rp = right[i + 1];
            res[i] = lp * rp;
            mult = mult * arr[i];
        }
        res[arr.length - 1] = mult * 1;
        return res;
    }

}
