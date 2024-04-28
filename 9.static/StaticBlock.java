/*
 * in JVM has a class loader memory, a class is loaded one time into heap. when class is loaded, static block is called.
 * below static block is called one times.
 * when we create a object of Mobile class. first time class is loaded and static block is called and constructor is called.
output:
Static block is executed
constructor called
constructor called


class loading -> then static block -> then constructor called
but: if we don't create any object, class will not be loaded

 */

class Mobile{
    String brand;
    int price;
    static String name;

    Mobile(){
        brand = "";
        price = 23423;
        System.out.println("constructor called");
    }

    static {
        name = "smartphone";
        System.out.println("Static block is executed");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        //  Mobile m = new Mobile();
        //  Mobile n = new Mobile();

       

    }
}
