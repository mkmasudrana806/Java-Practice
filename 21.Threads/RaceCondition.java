// race condition: multiple threads try to access same resource at the same time, this make inconsistent behavior. this is called race condition
// synchronized: synchronized with shared resources remove inconsistent or race condition. multiple thread can not access same resource at the same time.

class Counter{
    int count;
    // multiple threads or this method is not called multiple times at the same time
    public synchronized void increment(){
        count++;
    }
}


public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> 
        {
            for (int i = 0; i <10000; i++){
                 c.increment();
            }
        };

        // create Runnable object using lambda function
        Runnable obj2 = () -> 
        {
            for (int i = 0; i <10000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // we make two treads such that, after executing of these threads, main thread work then.
        t1.join();
        t2.join();

        System.out.println(c.count);

        // working with shared variable with multiple threads makes problem.
        // we can use synchronized in shared variable to make at a time one call or one thread can access shared variable. this make consistent
    }
}
