class A{
    public void show(){
        System.out.println("in class A");
    }

    class B{
        public void config(){
            System.out.println("config in class B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // obj.config();  // not possible as config() inside class B

        A.B obj2 = obj.new B();
        obj2.config();

        // or we can do like... when inner class is static 
        A.B obj3 = new A.B(); // not work for non static class
        // obj3.config();
    }
}
