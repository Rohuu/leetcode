package bitwiseOperators;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        boolean ans1=isNumberPowerOfTwo(0);
        boolean ans2=isNumberPowerOfTwoBitwiseMethod(0);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static boolean isNumberPowerOfTwo(int num){
        if (num==1){
            return true;
        }
        while(num>0){
            if(num%2!=0){
                return false;
            }
            num=num/2;
        }
        return true;
    }

    static boolean isNumberPowerOfTwoBitwiseMethod(int num){
        if((num & (num-1))==0){
            return true;
        }
        return false;
    }
}
