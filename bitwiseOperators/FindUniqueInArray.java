package bitwiseOperators;

public class FindUniqueInArray {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,3,3,9,5,6,7,4,8,4};
        System.out.println(uniqueNumberInDoubles(arr));
    }
    static int uniqueNumberInDoubles(int[] arr){
        int unique=arr[0];
        for (int i = 1; i < arr.length; i++) {
            unique=unique^arr[i];
        }
        return unique;
    }
}
