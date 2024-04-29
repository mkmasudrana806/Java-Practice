// import only specific class
// import codes.tools.math.Calc;

// import all files inside math folder: Calc and SciCalc file
import codes.tools.math.*;
//Note: * import all files inside a folder. * doesn't import folder.
import codes.B;

/**
 * default: access in the same package or directory
 * public: can be used from anywhere
 * private: can be used only same class or sub class when inherited
 * protected: can be accessed in the same class and sub class in same package
 */

public class PackageDemo {
    public static void main(String[] args) {
         Calc calc = new Calc();
         int res = calc.add(10, 20);
         System.out.println(res);

         SciCalc sciCalc = new SciCalc();
         double result = sciCalc.power(2, 3);
         System.out.println(result);

         // access modifier: marks inside B class should public as different package.
         B b = new B();
         System.out.println(b.marks);

         // access mark from AA class. this class and AA class resides in same package or same folder. no need to make mark as public
         AA a = new AA();
         System.out.println(a.mark);
         


    }
}
