import java.util.*;
class Main {
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        System.out.println("Enter the English:");
        int E=sc.nextInt();
        System.out.println("Enter the Tamil:");
        int T=sc.nextInt();
        System.out.println("Enter the Maths:");
        int M=sc.nextInt();
        System.out.println("Enter the science:");
        int S=sc.nextInt();
        System.out.println("Enter the Social science:");
        int SS=sc.nextInt();
        int total=((T+E+M+S+SS)/5);
        System.out.println("Average"+total);
    }
}
