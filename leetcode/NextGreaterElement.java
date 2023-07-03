//Qus: https://leetcode.com/problems/next-greater-element-i/

package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ans=nextGreaterElement(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map= new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<res.length;i++){
            res[i]= map.get(nums1[i]);
        }
        return res;
    }
}
