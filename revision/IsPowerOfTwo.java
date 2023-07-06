package revision;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        Boolean result=isPowerOfTwoLinearComplexity(0);
        System.out.println(result);
    }
    private static boolean isPowerOfTwo(long n){
        if(n==0){
            return false;
        }
        int count=0;
        while(n>0){
            if((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        if(count>1){
            return false;
        }
        return true;
    }
    private static boolean isPowerOfTwoLinearComplexity(int n){
        if(n==0){
            return false;
        }
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
}
