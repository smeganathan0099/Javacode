import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Born Year: ");
        int B = sc.nextInt();

        System.out.print("Enter the Current Year: ");
        int C = sc.nextInt();

        int count = 0;

        for (int i = B; i <= C; i++) {

            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                count++;
            }
        }

        System.out.println("No. of Leap Years: " + count);
    }
}
