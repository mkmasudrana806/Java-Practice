// Note: lambdas work only for functionalInterface


@FunctionalInterface // means this interface must have only one method
interface A{
     void show();
}

@FunctionalInterface
interface B{
    void show(int b);
}
public class LambdaDemo {
    public static void main(String[] args) {
        // => implementation of A interface using anonymous class.
        // A obj = new A()
        // {
        //     public void show(){
        //         System.out.println("in anonymous class");
        //     }
        // };
        // obj.show();

        // same thing using lambdas expression
        A obj = () -> {
            System.out.println("in anonymous class, no parameters");
        };
        obj.show();

        // passing parameters
        // no need to put parenthesis when parameter is one. parameter type is not mandatory
        B obj1 = (int a) -> {
            System.out.println("in anonymous class, with one parameter: " + a);
        };
        obj1.show(10);
    }
}
