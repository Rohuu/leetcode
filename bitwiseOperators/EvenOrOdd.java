package bitwiseOperators;

public class EvenOrOdd
{
    public static void main(String[] args) {
        evenOrOdd(450);
        evenOrOdd(45);
        evenOrOdd(0);
        evenOrOdd(7);
    }

    public static void evenOrOdd(int n){
        if((n & 1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}
