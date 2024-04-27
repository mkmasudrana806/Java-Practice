public class Arithmatic {
    public static void main(String[] args) {
        int num = 7;
        // num = num + 1;
        int resul = num++; // post-increment: fetch value then increment when num found. 7 
        int res = ++num; // pre-increment: increment value, then fetch. 8
        num += 2; // increment by a number or multiplication, division, or subtraction 10
        System.out.println(resul); // 7
        System.out.println(res); // 9. num++(pending), when ++num found, increment previous pending status to 8, then for ++num, increment the value that is 9.


    }
}
