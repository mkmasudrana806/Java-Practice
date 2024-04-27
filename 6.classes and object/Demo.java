class Calculator{
    int a = 100;
    public int add(int n1, int n2){
        int res = n1 + n2;
        return res;
    }
}
public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Calculator calc = new Calculator();
        int res = calc.add(num1, num2);
        System.out.println(res);
    }
}
