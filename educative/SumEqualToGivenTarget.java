// Qus:Given an array of sorted numbers and a target sum,find a pair in the array whose sum 
// is equal to the given target.

import java.util.ArrayList;
import java.util.List;

public class SumEqualToGivenTarget {
    public static void main(String[] args) {
        int[] arr = { -9, -3, 0, 3, 5, 7, 9, 11, 19 };
        int target = 8;
        System.out.println(sumIsEqualToTheGivenTarget(arr, target));
    }

    static List<Integer> sumIsEqualToTheGivenTarget(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if ((arr[i] + arr[j]) > target) {
                j--;
            } else if ((arr[i] + arr[j]) < target) {
                i++;
            } else {
                list.add(arr[i]);
                list.add(arr[j]);
                break;
            }
        }
        return list;
    }
}
