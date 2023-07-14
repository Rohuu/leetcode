package coding;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] ans1=findPrefixSum(arr);
        int[] ans2=findPrefixSumWithoutSpace(arr);
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
    }

    private static int[] findPrefixSumWithoutSpace(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    private static int[] findPrefixSum(int[] arr) {
        int[] prefixSum=new int[arr.length+1];
        prefixSum[0]=0;
        for(int i=1;i<prefixSum.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i-1];
        }
        return prefixSum;
    }
}
