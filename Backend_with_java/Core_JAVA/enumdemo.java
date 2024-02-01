package Backend_with_java.Core_JAVA;

enum Status{
    Running,Failed, Pending, Success;
}
public class enumdemo {
    public static void main(String A[]){
        int i = 5;
        Status s = Status.Running;
        System.out.println(s);
        //we can use Switch case
    }
}
