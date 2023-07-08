package coding;

public class isSubset {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={0};
        boolean ans=isSubset(arr1,arr2);
        System.out.println(ans);
    }

    static boolean isSubset(int[] arr1,int[] arr2){
        if(arr2.length>arr1.length){
            return false;
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean found=false;
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i]==arr1[j]){
                    found=true;
                    break;
                }
            }
            if(found==false){
                return false;
            }
        }
        return true;
    }
}
