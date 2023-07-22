
import java.util.ArrayList;
import java.util.List;

public class FindDistinctMultiplePairsWhoseSumIsK {
    public static void main(String[] args) {
        int[] arr = { -9, -3, 0, 3, 5, 7, 9, 11, 19 };
        int k = 8;
        System.out.println(multiplePairs(arr, k));
    }

    static List<List<Integer>> multiplePairs(int[] arr, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum > k) {
                j--;
            } else if (sum < k) {
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
        return res;
    }
}
