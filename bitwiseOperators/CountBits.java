package bitwiseOperators;

public class CountBits {
    public static void main(String[] args) {
        int ans1=countBitsMathematically(0);
        System.out.println(ans1);
        int ans2=countBitsInBinaryForm(0);
        System.out.println(ans2);
    }

    static int countBitsInBinaryForm(int num){
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            num= num>>1;
            count++;
        }
        return count;
    }

    static int countBitsMathematically(int n){
        if(n==0){
            return 1;
        }
        int count=0;
        while(n>0){
            n=n/2;
            count++;
        }
        return count;
    }
}
