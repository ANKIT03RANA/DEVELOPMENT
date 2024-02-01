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
class Bthread implements Runnable{
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

        obj1.start();  //this method comes under Thread Class
        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        // obj2.start();   //this method comes under Thread Class
        Thread obj3 = new Thread(obj2);
        obj3.start();
        Runnable obj4 = ()->{                 // using lamda expression as runnable is functional interface
            for(int i=1;i<=100;i++){
            System.out.println("hey");
             try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        };
        Thread obj5 = new Thread(obj4);
        obj5.start();
    }
    
}
