package revision;

public class Rev_SmallestSubArrayWithGivenSum {

    static int minSubArrayLength(int target, int[] nums) {
        int winStart = 0;
        int winEnd = 0;
        int winSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (winEnd = 0; winEnd < nums.length; winEnd++) {
            winSum = winSum + nums[winEnd];
            while (winSum >= target) {
                int length = winEnd - winStart + 1;
                minLength = Math.min(length, minLength);
                winSum = winSum - nums[winStart];
                winStart++;
            }
        }
        if (minLength != Integer.MAX_VALUE) {
            return minLength;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        int target=11;
        int ans=minSubArrayLength(target, nums);
        System.out.println(ans);
    }
}
