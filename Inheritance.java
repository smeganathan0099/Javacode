class mydaddy {
    void display() {
        System.out.println("My father is a farmer");
    }
}

class sister extends mydaddy {
    void show() {
        System.out.println("My sister is a business woman");
    }
}

class me extends mydaddy {
    void display1() {
        System.out.println("I am a speaker");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        me obj1 = new me();
      
        obj1.display1();

        sister obj2 = new sister();
        obj2.display();
        obj2.show();
    }
}
