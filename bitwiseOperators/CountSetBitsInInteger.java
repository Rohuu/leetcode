//Qus: https://www.codingninjas.com/codestudio/library/count-number-of-set-bits-in-an-integer

package bitwiseOperators;

public class CountSetBitsInInteger {
    public static void main(String[] args) {
        int ans1=countBits(1);
        int ans2=countBitsMethod2(1);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int countBits(int num){
        int count=0;
        while(num>0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    static int countBitsMethod2(int num){
        int count=0;
        while(num>0) {
            count++;
            num=num & (num-1);
        }
        return count;
    }
}
