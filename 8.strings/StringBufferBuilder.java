/*
 * Thread-safe" means that a class or an object is designed to be safely used by multiple threads concurrently without causing data corruption or unexpected behavior. In the context of StringBuffer and StringBuilder, it means that these classes have mechanisms in place to ensure that their methods can be safely called from multiple threads at the same time without conflicts or errors.
 */
public class StringBufferBuilder {
    public static void main(String[] args) {
        // default buffer size or capacity is 16 bytes.
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16

        StringBuffer sb1 = new StringBuffer("Masud");
        System.out.println(sb1.capacity()); // 21. always it add extra 16 bytes.

        System.out.println(sb1.length()); // length is 5. length and capacity is not same as buffer size. Length is not equal to buffer size.

        sb1.append(" Rana");
        sb1.delete(1, 3);
        sb1.insert(1, "as");
        System.out.println(sb1);
        sb1.setLength(30);
        System.out.println(sb1.capacity());
    }
}
