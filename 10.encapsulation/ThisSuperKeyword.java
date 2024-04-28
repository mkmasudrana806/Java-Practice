// Note: every class in java extends "Object", even we mention or not
class A extends Object{
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A with int ");
    }
}

class B extends A{
    // class constructor contains a super() method. even we define or not. must be first statement in constructor
    public B(){
        super(); // invisible method, means call constructor of super class's default constructor
        System.out.println("in B");
    }

    public B(int n){
        this(); // this() method called constructor of same class.
        // super(n); // now super() method called super class one parameterized constructor
        System.out.println("In B with value: " + n);
    }
}

public class ThisSuperKeyword {
    public static void main(String[] args) {
       B obj2 = new B(10);
    }
}
