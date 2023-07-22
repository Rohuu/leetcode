public class UniquePatternOfPython {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    System.out.print(i + 1 + "");
                } else {
                    System.out.print("0" + "");
                }
            }
            System.out.println();
        }
    }
}
