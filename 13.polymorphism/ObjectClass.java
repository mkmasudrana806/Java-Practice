class Laptop
{
    String model;
    int price;

    public String toString(){
         return "hi masud rana";
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "lenovo Yoga";
        obj1.price = 1000;

        System.out.println(obj1); // it return class name + @ + hascode of this object. by default it calls toString() method
        System.out.println(obj1); 

        // when we want to print obj, in class, toString() method is called automatically
        // so we can implement this method in Laptop class. it print value
        
        // comparing two object
        Laptop obj2 = new Laptop();
        obj2.model = "lenovo Yoga";
        obj2.price = 1000;

        boolean result = obj1 == obj2;
        System.out.println(result);

    }
}
