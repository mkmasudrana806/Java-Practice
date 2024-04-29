// final - variable, class, method
// final variable - means we can not change variable value later, it is constant
// final class - means no one can inherit this class, stop inheriting
// final method - no one can override this method. stop method overriding


// final class Calc{ // no one can inherit this class
class Calc{
    final String name = "Masud Rana";
    // name = "Rana"; can not possible to change final or constant variable
        
    // public void show(){
    //     System.out.println("this is masud sheikh");
    // }

    // final method means, stop overriding it 
    public final void show(){
        System.out.println("this is masud sheikh");
    }

    public void add(int a, int b){
        System.out.println("Adding " + (a  + b));
    }
}

// class AdvCalc extends Calc{ // as Calc is final class. we can not inherit this class
class AdvCalc  {
    public void show(){
        System.out.println("this is masud rana");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show(); // we override show() method

        // after make show() as final, we can not override even we inherit Calc class.

    }
}
