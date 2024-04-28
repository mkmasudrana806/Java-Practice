//method overriding: same method name with same no of parameters and types
// own class method priority is high

class A{
    public void show(){
        System.out.println("method inside class A");
    }
}

class B extends A{
    @Override // this show() method override it's parent method
    public void show(){
        System.out.println("method inside class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        // when we call show() method, priority is high which class object it is
        obj.show();

        // here show() method is called from class A. because obj is a class object
        A obj2 = new A();
        obj2.show();
    }
}
