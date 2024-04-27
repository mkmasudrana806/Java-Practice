public class Logical {
    public static void main(String[] args) {
        // logical: &&, || and !
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean res = x > y && a > b;
        System.out.println(res); // false

        boolean res1 = x > y && a < b;
        System.out.println(res1); // true

        boolean res3 = x < y;
        System.out.println(!res3); // true
    }
}
