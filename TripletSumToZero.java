import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {
    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { -4, -4, -1, 0, 3, 4, 6, -6, 4, -2, -2, 6, 9, 11, 21 };
        List<List<Integer>> ans = tripleSumZero(arr);
        System.out.println(ans);

    }

    static List<List<Integer>> tripleSumZero(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i - 1] != arr[i]) {
                doubleSumToZero(i + 1, arr.length - 1, arr, 0 - arr[i]);
            }
        }
        return res;
    }

    static void doubleSumToZero(int i, int j, int[] arr, int target) {
        int a1 = arr[i - 1];
        while (i < j) {
            if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a1);
                list.add(arr[i]);
                list.add(arr[j]);
                res.add(list);

                // duplicate i
                while (i < j && arr[i] == arr[i + 1]) {
                    i++;
                }

                // duplicate j
                while (i < j && arr[j] == arr[j - 1]) {
                    j--;
                }

                i++; // if no duplicacy
                j--; // normal i & j increment and decrement
            }
        }
    }
}
