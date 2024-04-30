class A{
    public void show(){
        for(int i=0; i<10; i++)
        {
            System.out.println("Hi");
        }
    }
}

class B{
    public void show(){
        for(int i=0; i<10; i++)
        {
            System.out.println("Hello");
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hi, under thread");
        }
    }
}

class D extends Thread{
    public void run(){
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello, under thread");
        }
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
        // create two object of A and B classes. then run show() method
        A obj = new A();
        B obj2 = new B();
        obj.show();
        obj2.show();
        // first 10 times "Hi" is printed then 10 times "Hello" is printed
        // because JVM work sequentially, first do A.show() method then B.show() method
        // in heap memory, program run this way means object works that way


        // thread example for class C and D
        // => make thread object: make class as thread, now any object creation also thread object. 
        // we have to obj.start() thread
        // what if we want to run two object at the same time? we need threads object, normal object we can't do that

        // Note: as thread we extends, it has start() method, so first create object of this Thread class are obj3 and obj4. then class start() method. but start() method call run() method

        C obj3 = new C();
        D obj4 = new D();

        // start() thread
        obj3.start();
        obj4.start();

        // basically these two threads works based on time sharing approach in Scheduler
        // we can give instructions to scheduler to make more priority in these threads

    }
}
