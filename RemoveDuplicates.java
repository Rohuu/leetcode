// Qus: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(uniqueElementsCount(arr));
    }

    static int uniqueElementsCount(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}