class Human{
    // private instance variables only accessible through this class
    private int age = 21;
    private String name = "Masud Rana";

    // constructor same as class name, no return type
    // we can do constructor overloading same as method overloading

    // default constructor. it is called implicitly if we don't make it.
    public Human(){
        age = 18;
        name = "Masud Rana";
        System.out.println("Default constructor called");
    }

    // parameterized constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    // getters and setters methods
    public int getAge() {
        return age;
    }
    // this is a keyword, which represent current object which we called from obj in main method
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
   
}
public class Encapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        // System.out.println(h.age); // not possible to access directly as age is private
        System.out.println(h.getAge());

        // assign value to private variable using setter method
        Human h2 = new Human(30, "sheikh");
        System.out.println(h2.getAge());
 
      }
}
