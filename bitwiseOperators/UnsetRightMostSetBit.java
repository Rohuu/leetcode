package bitwiseOperators;

public class UnsetRightMostSetBit {
    public static void main(String[] args) {
        int ans=turnOffRightMostSetBit(7);
        System.out.println(ans);
    }

    private static int turnOffRightMostSetBit(int num) {
        num= num & (num-1);
        return num;
    }


}
