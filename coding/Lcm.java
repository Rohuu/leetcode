package coding;

public class Lcm {
    public static void main(String[] args) {
        int lcm=findLCM(0,0);
        System.out.println(lcm);
    }

    static int findLCM(int num1,int num2){
        if(num1==0 || num2==0){
            return 0;
        }
        int max=Math.max(num1,num2);
        int min=Math.min(num1,num2);

        for(int i=max; ;i=i+max){
            if(i % min==0){
                return i;
            }
        }
    }
}
