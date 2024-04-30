class A extends Thread{
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

class B extends Thread{
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
 
public class ThreadSleep {
    public static void main(String[] args) {
 
        A obj3 = new A();
        B obj4 = new B();

        // start() thread
        obj3.start();
        obj4.start();

        // we can interrupt the thread worker for a few milliseconds
         // use Thread.sleep() after each thread works
    }
} 