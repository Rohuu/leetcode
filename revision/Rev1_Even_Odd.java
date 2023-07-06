package revision;

public class Rev1_Even_Odd {
    public static void main(String[] args) {
        String ans=evenOdd(0);
        System.out.println(ans);
    }

    static String evenOdd(int num){
        if((num & 1) ==1){
            return "ODD";
        }
        return "EVEN";
    }
}
