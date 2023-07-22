// Qus: Given an array with positive numbers and a target number, find all of its contiguous subarrays 
// whose product is less than the target number.

// brute force approach

import java.util.ArrayList;
import java.util.List;

public class SubarraysWithProductLessThanTarget {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 10 };
        int target = 30;
        List<List<Integer>> ans = listOfSubarrays(arr, target);
        System.out.println(ans);
    }

    static List<List<Integer>> listOfSubarrays(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int multDigits = 1;
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    multDigits = multDigits * arr[k];
                    if (multDigits < target) {
                        list.add(arr[k]);
                    }
                }
                if (multDigits < target) {
                    res.add(list);
                }
            }
        }
        return res;
    }
}
