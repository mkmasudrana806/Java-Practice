class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        
        // force fully we can throw exception class based on some condition
       try {
        int age = 152;
        if(age < 18) throw new ArithmeticException("because, below 18 are not allow to vote"); // also we can pass exception message

        // also we can create own exception type by creating a class and extents Exception and call super(msg)
        else throw new MyException("Your are able to vote");
       } catch (ArithmeticException e) {
        System.out.println("Your are not able to vote " + e.getMessage());
        }
        catch (MyException e){
            System.out.println("you are able to vote, because " + e.getMessage());
        }
    }    
}

/**
 * Ducking exception: means we can not handle exceptin, we simply throws exception to whom is called this method. mainly who is called a method responsible to handle throws exception, this is called Exception ducking.
 * Note: don't ducking exception in main method like throws ArithmeticException. who called main method? that is JVM. JVM will simply stop the program execution. so don't do that in main method
 */