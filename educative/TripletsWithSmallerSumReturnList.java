import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsWithSmallerSumReturnList {
    public static void main(String[] args) {
        int[] arr = { -1, 4, 2, 1, 3 };
        int target = 5;
        List<List<Integer>> ans = findTriplets(arr, target);
        System.out.println(ans);
    }

    static List<List<Integer>> findTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for (int m = 0; m < arr.length - 2; m++) {
            findDoubles(m + 1, arr.length - 1, arr, target - arr[m], res);
        }
        return res;
    }

    static void findDoubles(int i, int j, int[] arr, int target, List<List<Integer>> res) {
        int firstValue = i - 1;
        while (j > i) {
            int sum = arr[i] + arr[j];
            if (sum < target) {
                for (int k = j; k > i; k--) {
                    res.add(Arrays.asList(arr[firstValue], arr[i], arr[k]));
                }
                i++;
            } else {
                j--;
            }
        }
    }

}
