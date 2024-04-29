/**
 * => abstract method only resides in abstract class. abstract class can have abstract methods and normal methods
 * => abstract method only declare, implement it in sub class.
 * => we can not create instance of abstract class
 */


abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("play music");
    }
}

class Wogon extends Car{
    public void drive(){
        System.out.println("car can drive");
    }   
}
public class Demo {
    public static void main(String[] args) {
        Car obj = new Wogon();
        obj.drive();   
    }
}
