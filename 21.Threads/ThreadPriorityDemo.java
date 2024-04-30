class A extends Thread{
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello");
        }
    }
}
 
public class ThreadPriorityDemo {
    public static void main(String[] args) {
 
        // Note: as thread we extends, it has start() method, so first create object of this Thread class are obj3 and obj4. then class start() method. but start() method call run() method

        A obj3 = new A();
        B obj4 = new B();

        // start() thread
        obj3.start();
        obj4.start();

        // => priority: getPriority(), setPriority(value). priority range 1 to 10.
        // setPriority() doesn't means that thread will first execute, no, scheduler works it's own way, it has many algorithm. we just notify scheduler that when obj3 and obj4 thread comes, obj4 gives highest priority

        // basically these two threads works based on time sharing approach in Scheduler
        // we can give instructions to scheduler to make more priority in these threads

        System.out.println(obj3.getPriority()); // obj1 priority is 5
        System.out.println(obj4.getPriority()); // obj5 priority is 5

        obj3.setPriority(10);

        

    }
}
