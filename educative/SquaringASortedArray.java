import java.util.Arrays;

// Qus: Given a sorted array, create a new array containing squares of all the number of the 
// input array in the sorted order using brute force approach.

public class SquaringASortedArray {
    public static void main(String[] args) {
        int[] arr = { -4, -2, 0, 1, 3 };
        int[] ans = squareOfAnSortedArrayInSortedForm(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] squareOfAnSortedArrayInSortedForm(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] * arr[i];
        }
        Arrays.sort(res);
        return res;
    }
}
