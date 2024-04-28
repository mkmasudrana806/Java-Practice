class A{
    public A() {
        System.out.println("object is created");
    }
    public void show(){
        System.out.println("Yes method is called with help of the anonymous object");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new A().show(); // anonymous object, we don't have created any reference object.
        // we can not reuse it.
        
    }
}
