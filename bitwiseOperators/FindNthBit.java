package bitwiseOperators;

public class FindNthBit {
    public static void main(String[] args) {
        int ans1 = findNthBitInNumber1(21, 1);
        int ans2 = findNthBitInNumber2(21, 2);
        int ans3 = findNthBitInNumber3(21, 4);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int findNthBitInNumber1(int num, int position) {
        if ((num & (1 << (position - 1))) >> (position - 1) == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    // or
    static int findNthBitInNumber2(int num, int position) {
        if ((num & (1 << (position - 1))) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //or
    static int findNthBitInNumber3(int num, int position) {
        int tempNum=num;
        if ((tempNum >> (position-1) & 1) == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
