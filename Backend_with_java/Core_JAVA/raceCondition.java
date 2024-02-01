package Backend_with_java.Core_JAVA;

class count{
    int count;
    public synchronized void increment(){ // synchronized is written so that out of many threads one can call at a time.
        count++;
    }
}

public class raceCondition {
    public static void main(String[] args) {
        count c = new count();
        Runnable obj1 = ()->{                 // using lamda expression as runnable is functional interface
            for(int i=1;i<=100;i++){
            c.increment();
        }
        };
        Runnable obj2 = ()->{                 // using lamda expression as runnable is functional interface
            for(int i=1;i<=100;i++){
            c.increment();
        }
        };
        Thread obj3 = new Thread(obj1);
        Thread obj4 = new Thread(obj2);
        obj3.start();
        obj4.start();

        try {
            obj3.join();  // now main method will wait till these thread bring their result
            obj4.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(c.count);
    }
}
