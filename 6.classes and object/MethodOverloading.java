class Calculator{
    // method overloading: with the same method name, with different parameters and types

    public int add(int n1 , int n2){
        return n1 + n2;
    }
    public int add(int n1 , int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1 , double n2){
        return n1 + n2; 
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator clc = new Calculator();
         System.out.println(clc.add(10, 20)); // two int parameters
         System.out.println(clc.add(5.3, 3.9)); // two double parameters
         System.out.println(clc.add(10, 20, 30)); // three int parameters


    }
}
