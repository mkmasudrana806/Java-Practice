// annotation means logical error finding using java some @rules
// like @override, when we use @override in inheritance, if by chance we make any mistake in method implementations, @override gives us error messages

// class level annotation
@Deprecated // means when someone try to use this class, he get this class is deprecated
class A{
    public void show(){
        System.out.println("show in A");
    }
}
class B extends A{
    // i have made mistake, target implementation of show() method. but this method() doesn't give errors message.
    // public void shows(){
    //     System.out.println("show in B");
    // }

    // @Override // gives error that shows() method is not super type implementation.
    // public void shows(){
    //     System.out.println("show in B");
    // }

        public void show(){
            System.out.println("in show B");
        }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
