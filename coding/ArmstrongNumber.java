package coding;
import java.io.IOException;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of inputs");
        int num=sc.nextInt();
        System.out.println("Enter inputs");
        int[] array=new int[num];
        for (int i = 0; i < num ; i++) {
            array[i]=sc.nextInt();
        }

        List<Integer> inputs=new ArrayList<>();
        for (int j = 0; j < num; j++) {
            inputs.add(array[j]);
        }

        List<String> ans=armstrongNumber(inputs);
        System.out.println(ans);
    }

    public static List<String> armstrongNumber(List<Integer> inputs) {
        List<String> armstrongNumbers=new ArrayList<>();
        for(int i=0;i<inputs.size();i++){
            int number=inputs.get(i);
            if(isNumberArmstrong(number)){
                armstrongNumbers.add("It is an ARMSTRONG number");
            }
            else {
                armstrongNumbers.add("It is NOT an ARMSTRONG number");
            }
            System.out.println();
        }
        return armstrongNumbers;
    }
    private static boolean isNumberArmstrong(int number){
        int tempNum=number;
        int ans=0;
        while(number>0){
            int unitDigit=number%10;
            number=number/10;
            ans = (int) (ans + Math.pow(unitDigit,3));
        }
        if(tempNum==ans){
            return true;
        }
        return false;
    }
}
