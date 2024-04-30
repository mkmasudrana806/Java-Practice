import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryCatchFinally {
    public static void main(String[] args) {
        // here, try() handle resources automatically close task
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
         int num = Integer.parseInt(bf.readLine());
         System.out.println("You have typed: " + num);
        } catch (Exception e) {
            System.out.println("something went wrong");
         }
    }
}
