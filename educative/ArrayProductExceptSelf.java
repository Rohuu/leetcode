
// of all the elements of nums except nums[i].

import java.util.Arrays;

public class ArrayProductExceptSelf {
    public static void main(String[] args) {
        // input Non zero array
        int[] nums = { 1, 2, 3, 0, 5 };
        int[] ans = returnArrayWithProductExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] returnArrayWithProductExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];

        if (nums.length == 0) {
            return arr;
        }

        int productOfNumsArray = nums[0];
        for (int i = 1; i < nums.length; i++) {
            productOfNumsArray = productOfNumsArray * nums[i];
        }

        for (int j = 0; j < nums.length; j++) {
            arr[j] = productOfNumsArray / nums[j];
        }
        return arr;
    }
}
