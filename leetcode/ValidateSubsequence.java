import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);
        boolean ans = isValidSubsequence(array, sequence);
        System.out.println(ans);
    }

    private static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if (sequence.size() > array.size()) {
            return false;
        }
        if (array.equals(sequence)) {
            return true;
        }

        int j = 0;
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            if (sequence.get(j) == array.get(i)) {
                count++;
                j++;
            }
            if (count == sequence.size()) {
                return true;
            }
        }
        return false;
    }
}