package loops;

public class er {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= 5; i++) {
            for (int a = rows - i; a >= 1; a--) {
                System.out.print(" ");

            }
            for (int d = 1; d <= i; d++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}