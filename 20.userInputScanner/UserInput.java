import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {

        // => print something to console
        // println() is a method of printStream class
        // out is an object of printStream class
        // System is a class. inside System out is a static property of System class
        // so access of printLn method: System.out.println() to print something
        System.out.println("Masud Rana");

        // => user input
        // in is an object of inputStream class
        // inputStream has a method of read() which take a single character ascii value
        // in object is a static property of System class. 
        // Note: read() method throws an exception, handle it. developer should handle it. this is called checkedException
        int input = System.in.read(); // return integer ascii value of any character ascii value
        System.out.println(input);
        // must run program in terminal


        // => take line of string from user
        // use BufferReader class. it use for taking input buffer from anywhere like console, network, file etc

        InputStreamReader in = new InputStreamReader(System.in); // it takes InputStream object in
        BufferedReader bf = new BufferedReader(in); // it requires InputStreamReader object
        int nums = Integer.parseInt(bf.readLine());
        System.out.println(nums);
        // BufferedReader trying to access resources like file, network, db connection etc, so it requires to close
        bf.close();

        // => shortcut way to take user input
        Scanner sc = new Scanner(System.in); // it requires input source
        int n = sc.nextInt(); // no need to parse to int. it automatically parse to int
        System.out.println(n);
    }
}
