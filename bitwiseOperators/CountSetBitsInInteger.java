//Qus: https://www.codingninjas.com/codestudio/library/count-number-of-set-bits-in-an-integer

package bitwiseOperators;

public class CountSetBitsInInteger {
    public static void main(String[] args) {
        int ans=countBits(1);
        System.out.println(ans);
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
}
