class Mobile{
    String brand;
    int price;

    // non-static reference not possible inside static method.
    
    public static void show(Mobile obj){
        System.out.println(obj.brand + obj.price);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        // Mobile.show(); // which object want to access it? that is the problem here
        Mobile m = new Mobile();
        m.brand = "apple";
        m.price = 10;
        Mobile.show(m); // we can pass a reference object to the show method. then show can execute it as passed object is an object
    }
}
