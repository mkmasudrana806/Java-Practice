// thread implementation using Runable interface. when a class want to extends another class, as well as we can not extends Thread class in same class. in this case we can create thread using runable interface. 

/**
 * steps: implements Runnable interface ( line 13 and 29)
 * create two threads. then pass runnable object into threads constructor (line 51 and 52 )
 * now call these thread using start() ( line )
 */
class Z{
    public void show(){
        System.out.println("this class is extended by class A");
    }
}
class A extends Z implements Runnable {
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hi");

            // hold on for 10 milliseconds for sleep this thread for 10 milliseconds
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello");

             // hold on for 10 milliseconds for sleep this thread for 10 milliseconds
             try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
 
public class RunableExample {
    public static void main(String[] args) {
 
        A obj3 = new A(); // this are similar as Runnable obj3 = new A(). as A class is implements Ruannable interface
        B obj4 = new B();

        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);

        // start() thread
        t1.start();
        t2.start();

        // we can interrupt the thread worker for a few milliseconds
         // use Thread.sleep() after each thread works
    }
} 