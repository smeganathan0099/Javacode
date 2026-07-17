# Javacode
Placement Training Class -JAVA
public class Main{
    public static void main(String[] args)
    {
        int i=1;
        while(i<=50){
                if(i%3==0&&i%5==0){
            System.out.println("Fizz Buzz");
            i++;
            }
            else if(i%3==0){
                    System.out.println("Fizz");
                            i++;
                }
                else if(i%5==0){
                        System.out.println("Buzz");
                        i++;
                    }
                    else{
        System.out.println(i);
        i++;}
    }
    }
}
