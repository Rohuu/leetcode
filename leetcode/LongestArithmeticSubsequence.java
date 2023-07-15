//Qus: https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
// Using brute force but TLE in some test cases //
package leetcode;

public class LongestArithmeticSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int difference = 1;
        System.out.println(longestSubsequence(arr,difference));
    }

    private static int longestSubsequence(int[] arr, int difference) {
        int maxLength=0;
        int tempDiff=difference;
        for(int i=0;i<arr.length;i++){
            int count=1;
            difference=tempDiff;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]-arr[i]==difference){
                    count++;
                    difference=difference+tempDiff;
                }
            }
            maxLength=Math.max(count,maxLength);
        }
        return maxLength;
    }
}
