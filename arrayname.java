import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"Indhu", "Dharshu", "Sanvi"};
        System.out.print("Enter the name to search: ");
        String n = sc.nextLine();
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(n)) {
                System.out.println("Name found");
                return;
            }
        }
        System.out.println("Name not found");
    }
}
