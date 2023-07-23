package leetcode;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] array={-4,-2,-1,2,3,5,6};
        int[] ans=sortedSquaredArray(array);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] sortedSquaredArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int[] squred = new int[array.length];
        int n = array.length - 1;

        while (end >= start) {
            int startSqr = array[start] * array[start];
            int endSqr = array[end] * array[end];

            if (startSqr > endSqr) {
                squred[n] = startSqr;
                n--;
                start++;
            } else {
                squred[n] = endSqr;
                n--;
                end--;
            }
        }
        return squred;
    }
}
