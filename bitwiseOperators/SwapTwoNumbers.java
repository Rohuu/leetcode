package bitwiseOperators;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swapNumbers(7,5);
    }

    static void swapNumbers(int a, int b){
        a=a^b;
        b=a^b;
        a=b^a;
        System.out.println(a);
        System.out.println(b);
    }
}
