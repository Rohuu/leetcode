package bitwiseOperators;

public class SetRightMostUnsetBit {
    public static void main(String[] args) {
        int ans=setRightMostUnsetBit(15);
        System.out.println(ans);
    }

    private static int setRightMostUnsetBit(int num) {
        if(((num+1) & num)==0){
            return num;
        }
        num= num | (num+1);
        return num;
    }
}
