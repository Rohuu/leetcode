package coding;

public class ArmStrong {
    public static void main(String[] args) {
        boolean res=isNumberArmstrong(153);
        System.out.println(res);
    }

    private static boolean isNumberArmstrong(int number){
        int copyNumber=number;
        int ans=0;
        while(number>0){
            int unitDigit=number%10;
            ans= ans+(unitDigit*unitDigit*unitDigit);
            number=number/10;
        }
        if(ans==copyNumber){
            return true;
        }
        return false;
    }
}
