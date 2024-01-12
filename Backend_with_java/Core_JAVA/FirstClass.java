package Backend_with_java.Core_JAVA;

class Mobile{
    String Brand,model;
    static String name;                                                     // Static Variable
    static{                                                                 // Static Block{}
        name="smartphone";
    }
    Mobile(){
        Brand="Mobile";
        model="xyz";
    }
    public void show(){
        System.out.println(Brand + ": " + model + " " + name);
    }
    static void show1(Mobile Obj){                                          // Static Method
         System.out.println(Obj.Brand + ": " + Obj.model + " " + name);
    }
}

class Calculator{
    public int add(int n1,int n2){
        return n1 + n2;
    }
}
public class FirstClass {
    public static void main(String arg[]){
        Calculator calc = new Calculator();
        System.out.println(calc.add(4,6));
        Mobile mob = new Mobile();
        mob.show();
        Mobile.show1(mob);                                                  // Static Method Calling
    }
}