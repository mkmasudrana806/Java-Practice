public class VariableExample {
    public static void main(String[] args) {
        int num = 30;
        float marks = 3.66f;
        double cgpa = 3.666; // no need to add f to last. by default java work with double data type.
        long myLongNumber = 2323432l;
        char c = 'a';
        boolean b = true;
        // byte by = 129; // gives data loss. as byte can hold -128 to 127 range
        byte by = 122;

        // literals
        int num1 = 0b101; // equivalent decimal 5. put 0b before any binary number
        System.out.println(num1);

        int num2 = 10_00_00_000; // underscore support. 
        System.out.println(num2);

        double num3 = 12e10;
        System.out.println(num3);

    }
}
