import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripleSumEqualToTarget {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { -4, -4, -1, 0, 3, 4, 6, -6, 4, -2, -2, 6, 9, 11, 21 };
        int target = 6;
        List<List<Integer>> ans = tripleSum(arr, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> tripleSum(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] != arr[i - 1]) {
                doubleSum(i + 1, arr.length - 1, arr, target - arr[i]); // a+b=target-c
            }
        }
        return res;
    }

    private static void doubleSum(int i, int j, int[] arr, int target) {
        int a = arr[i - 1];
        while (i < j) {
            if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(arr[i]);
                list.add(arr[j]);
                res.add(list);

                while (i < j && arr[i] == arr[i + 1]) {
                    i++;
                }

                while (i < j && arr[j] == arr[j - 1]) {
                    j--;
                }
                i++;
                j--;
            }
        }

    }
}
