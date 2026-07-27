abstract class payment{
    abstract void pay();
    void receipt(){
        System.out.println("Receipt Generated");
    }
}
class UPI extends payment{
    void pay(){
        System.out.println("Paid using UPI ");
    }
}
class card extends payment{
    void pay(){
        System.out.println("Paid using card");
    }
}
public class Main{
    public static void main(String[]args){
        UPI d=new UPI();
        d.pay();
        d.receipt();
    }
}
