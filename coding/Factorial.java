package coding;

public class Factorial {
    public static void main(String[] args) {
        int ans1=calculateFactorial(30);
        int ans2=calculateFactUsingRecursion(30);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int calculateFactorial(int n){
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }

    static int calculateFactUsingRecursion(int n){
        if(n==0){
            return 1;
        }
        return n * calculateFactUsingRecursion(n-1);
    }
}
