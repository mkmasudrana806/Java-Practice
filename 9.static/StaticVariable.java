
class Mobile{
    String brand;
    int price;
    static String name; // static variable belong to class. not object. common property value we can write as static. all object share the static variable. static variable reduce memory

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand = "Apple";
        m.price = 234234;
        // m.name = "Smartphone"; 
        Mobile.name = "Smartphone"; // access using class as static variable belong to class. not object.

        Mobile n = new Mobile();
        n.brand = "Samsung";
        n.price = 324;
        // n.name = "Smartphone";

        m.show();
        n.show();
    }
}
