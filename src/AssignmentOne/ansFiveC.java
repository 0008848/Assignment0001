package AssignmentOne;

public class ansFiveC {
    public static void main(String[] args) {
        int n = 5;
        int m = 0;
        for (int i = 1; i <= n; ++i, m = 0) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }
            while (m != 2 * i - 1) {
                System.out.print("* ");
                ++m;
            }
            System.out.println();
        }
    }
}
