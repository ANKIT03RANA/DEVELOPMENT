package Backend_with_java.Core_JAVA;



class Athread extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class Bthread extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
             try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class conceptThread {
    public static void main(String[] args) {
        Athread obj1=new Athread();
        Bthread obj2 = new Bthread();

        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());

        obj1.start();
        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        obj2.start();
    }
    
}
