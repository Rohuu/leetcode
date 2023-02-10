public class RemoveDuplicatesUsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        System.out.println(getUniqueElementsFromSortedArray(arr));
    }

    static int getUniqueElementsFromSortedArray(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i + 1];
                j++;
            }
        }
        return j;
    }
}
