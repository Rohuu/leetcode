// Qus: Given an array with positive numbers and a target number, find all of its contiguous subarrays 
// whose product is less than the target number.

// using two pointers and sliding window approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayProductLessThanTargetTwoPointer {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 10 };
        int target = 300;
        List<List<Integer>> ans = subarrayProductLessThanTarget(arr, target);
        System.out.println(ans);
    }

    static List<List<Integer>> subarrayProductLessThanTarget(int[] arr, int target) {
        int left=0;
        int product=1;
        for(int right=0;right<arr.length;right++){
            product=product*arr[right];
            while(product>=target){
                product=product/arr[left];
                left++;
            }
            List<Integer> list=new ArrayList<>();
            for (int i = right; i >=left; i--) {
                list.add(arr[i]);
                res.add(new ArrayList<>(list));
            }
        }
        return res;
    }
}
