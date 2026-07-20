import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {70, 80, 60, 70, 80};
        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == num) {
                System.out.println("Number found");
                return;
            }
        }

        System.out.println("Number not found");
    }
}
