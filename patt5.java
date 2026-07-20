public class Patt5 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers in reverse
            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
