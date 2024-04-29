abstract class A{
    public void show(){
        System.out.println("in class A");
    }

    abstract public void config();
}
public class AnonymousClass {
    public static void main(String[] args) {
        // inner anonymous class, overriding example of show() method
        // abstract class implementation example of config() method
        A obj = new A(){
            public void show(){
                System.out.println("in inner anonymous class");
            }

            // in above, A obj = new A(){}; means we create a new anonymous class of A class. 
            // it doesn't mean we create an object of class A. A is abstract class, we don't do that
            @Override
            public void config() {
                 System.out.println("config implementation inside anonymous class");
            }
        };
        obj.show();
        obj.config();
    }
}
