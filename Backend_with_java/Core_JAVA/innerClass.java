package Backend_with_java.Core_JAVA;

class A{

    int var;

    void show(){
        System.out.println("in show");
    }

    class B{ //Inner class
        void config(){
            System.out.println("in config");
        }
    }

    static class C{ // Static Inner Class
        void config1(){
            System.out.println("in config1");
        }
    }
}
public class innerClass {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();

        A.B obj1= obj.new B();
        obj1.config();

        A.C obj2 = new A.C();
        obj2.config1();
    }
}
