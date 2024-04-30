// instead of using class A. use lambda instead for thread t1
// class B as usual by implementing Runnable interface


class B implements Runnable {
    public void run(){
        for(int i = 0; i <100; i++){
            System.out.println("Hi..");
        }
    }
}

public class RunnableLambda {
    public static void main(String[] args) {

        Runnable obj1 = new B(); // or B obj1 = new B();

        // create Runnable object using lambda function
        Runnable obj2 = () -> 
        {
            for (int i = 0; i <100; i++){
                System.out.println("Hello");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
