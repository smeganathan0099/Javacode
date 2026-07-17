public class Main {
    public static void main(String[] args) {
        int i = 2005;
        while (i <= 2026) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
