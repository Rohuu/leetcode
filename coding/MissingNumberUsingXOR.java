package coding;

public class MissingNumberUsingXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 4, 5, 6, 7, 9};
        int missingNum = 0;
        for (int i = 0; i < arr.length; i++) {
            missingNum = missingNum ^ arr[i];
        }
        System.out.println(missingNum);
    }
}
