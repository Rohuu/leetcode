package bitwiseOperators;

public class CalculatePower {
    public static void main(String[] args) {
        int ans1=powerOfNumberMathematically(10,1);
        int ans2=powerOfNumberBitwise(10,1);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int powerOfNumberMathematically(int a,int b){
        int mult=1;
        for (int i = 0; i < b; i++) {
            mult=mult*a;
        }
        return mult;
    }
    // loop is running b times so complexity is o(b);



    static int powerOfNumberBitwise(int base,int power){
        int ans=1;
        while(power>0){
            if((power & 1)==1) {
                ans = ans * base;
            }
            base=base*base;
            power=power>>1;
        }
        return ans;
    }


}
