//Qus: https://leetcode.com/problems/sqrtx/

package leetcode;

public class SqrtUsingBinarySearch {
    public static void main(String[] args) {
        int ans=mySqrt(8);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}

