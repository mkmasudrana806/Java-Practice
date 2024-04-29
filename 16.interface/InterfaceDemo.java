/*
 * => all methods inside Interface is by default public abstract
 * => we can not create instance variable of Interface
 * => who will inherit interface requires abstract class with implements of interface methods
 */

interface A{
    // by default all variables are final and static
    int age = 20;
    String name = "Masud Rana";

    // by default all the methods are public abstract.
    void show();
    void config();
}

interface X extends A{
    void run();
}

class B implements X{

    @Override
    public void config() {
        System.out.println("in show");
        
    }

    @Override
    public void show() {
        System.out.println("in config");
        
    }

    @Override
    public void run(){
        System.out.println("in run method");
    }
    
}
public class InterfaceDemo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(obj.name);

        X obj1 = new B();
        obj1.run();


        // obj.age = 22; // we don't as age is static and final

        // an interface can extends another interface
        // a class can implements multiple interface

        // class - class -> extends
        // inteface - class -> implements
        // interface - interface -> extends
    }
}
