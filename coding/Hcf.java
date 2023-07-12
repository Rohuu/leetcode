package coding;

public class Hcf {
    public static void main(String[] args) {
        int ans=findHCF(3,7);
        System.out.println(ans);
    }

    static int findHCF(int num1,int num2){
        if(num1==0 && num2==0){ //undefined
            return -1;
        }
        if(num1==0){
            return num2;
        }
        if(num2==0){
            return num1;
        }
        int hcf=0;
        int min=Math.min(num1,num2);
        int max=Math.max(num1,num2);
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                hcf=Math.max(hcf,i);
            }
        }
        return hcf;
    }
}
