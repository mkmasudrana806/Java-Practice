/**
there are three types of exceptions: compiletime, runtime, and logical errors
=> mainly we handle runtime exceptions
=> Exception is super class exception. it has many class for different type of exceptions
like ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException etc sub class
=> to use multiple catch block, put super class exception in below. sub class exception first.
ArithmeticException ->  Exception -> 
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // int i = 0;
            int i = 3;
            int res = 3 / i; // ArithmeticException when i becomes 0
            System.out.println("result is: " + res);

            int len = "32423".length();
            System.out.println(len);

            int nums[] = new int[5];
            System.out.println("value of index 5 is: " + nums[5]); // ArrayIndexOutOfBoundsException

            // handle multiple catch block, sub class first, super class at last when we don't know which exception types
        } catch (ArithmeticException e) {
            System.out.println(e);
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
         }
         catch(NullPointerException np){
            System.out.println(np);
         }
         // it handle all exceptions when above is not catch
         catch(Exception e){
            System.out.println(e);
         }

    }
}
