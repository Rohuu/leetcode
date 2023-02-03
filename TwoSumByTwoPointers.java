import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumByTwoPointers {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, -1, 0, 3, -4 };
        findCombinationsOfTwoSum(arr, 6);
    }

    static void findCombinationsOfTwoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);
                res.add(list);
                i++;
                j--;
            }
        }
        System.out.println(res);
    }
}
