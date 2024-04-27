public class TypeConversion {
    public static void main(String[] args) {
        // byte and int conversions
        byte b = 125;
        int a = b; // possible 
        System.out.println(a);

        byte k = (byte)a; 
        System.out.println(k);
        byte x = (byte) 257; // it do modulus operation, remainder will store into byte variable

        // float and int conversions
        float f = 5.6f;
        int z = (int) f;
        System.out.println(z); // 5

        // type promotion
        byte m = 10;
        byte n = 30;
        int result = m * n; // out of range of a and b multiplication. they promoted and conversions are done automatically into int.
        System.out.println(result); // 300


        // type conversion and casting
        int aa = 10;
        byte bb = 127;
        // bb = a; // not possible. narrow conversion. bigger data type cannot be fitted into small byte
        aa = bb; // possible conversion. winding conversion
        // automatically conversion. this is implicit conversion

        // int x = 5.6f; // not possible implicitly conversion.
        float ff = 5.6f;
        int xx = (int) ff; // type casting. explicit type conversion. value will be lost here.
        

        System.out.println(xx);
    }
}
