// Qus: https://leetcode.com/problems/squares-of-a-sorted-array/
// using two pointers approach  //

public class SquringASortedArray2 {
    public static void main(String[] args) {

    }

    static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = res.length - 1;

        while (j >= i) {
            int firstSqure = nums[i] * nums[i];
            int lastSqure = nums[j] * nums[j];
            if (firstSqure > lastSqure) {
                res[k] = firstSqure;
                i++;
                k--;
            } else if (firstSqure < lastSqure) {
                res[k] = lastSqure;
                j--;
                k--;
            } else {
                res[k] = firstSqure;
                k--;
                i++;
            }
        }
        return res;
    }
}
