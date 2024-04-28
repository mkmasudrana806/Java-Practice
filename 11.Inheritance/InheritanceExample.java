/**
 * Single Inheritance
 * Multi level inheritance
 * Multiple Inheritance not supported in java. because of ambiguity
 */
// parent class, base class, or super class
class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

// sub class, child class or 
// AdvancedCalculator extends Calculator
class AdvancedCalculator extends Calculator{
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
}

// SciCalculator extends AdvancedCalculator
class SciCalculator extends AdvancedCalculator{
        public double power(int a, int b){
            return Math.pow(a, b);
        }
}
public class InheritanceExample {
        public static void main(String[] args) {
            // all the methods and properties are also resides in AdvancedCalculator. single inheritannce
            AdvancedCalculator clc = new AdvancedCalculator();
         int r1 =  clc.add(10, 2);
         int r2 =    clc.sub(32, 3);
        int r3 =  clc.mul(3, 5);
          int r4 =   clc.div(9, 3);
          System.out.println(r1 + " " + r2 + " " + r3 + " "+ r4);
            
          // SciCalculator have the all the characteristic of both AdvancedCalculator as well Calculator. because of multilevel inheritance
            SciCalculator sci = new SciCalculator();
            double r5 = sci.power(2, 3);
            System.out.println(r5);
        }
}
