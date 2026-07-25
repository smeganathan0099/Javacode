class college{
    void department(){
        System.out.println("Welcome to Excel Engineering college");
    }
}
class CSE extends college{
    
    
    void department(){
        System.out.println("Welcome to Computer Department");
    }
}
class ECE extends college{
   
    void department(){
        System.out.println("Welcome to Electronics and Communication Engineering");
    }
}
class EEE extends college{
    
    void department(){
        System.out.println("Welcome to Electrical and Electronics Engineering Department");
    }
}
    public class poly{
        public static void main(String[]args){
            college c=new CSE();
            c.department();
            college d=new ECE();
            d.department();
            college e=new EEE();
            e.department();
        }
    }
        
