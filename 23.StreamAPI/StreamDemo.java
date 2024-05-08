import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        // nums.add(4);
        // nums.add(34);

        // instead we can add nums to the list 
        List<Integer> nums = Arrays.asList(5, 1, 9, 3, 6, 2, 7);
        System.out.println(nums);

        // double even numbers then sum them
        int sum = 0;
        for(int n: nums){
            if(n % 2 == 0){
                n = n * 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        // another way to print ArrayList
        nums.forEach(num -> System.out.println(num));

        // another way
        for(int num : nums){
            System.out.println(num);
        }

        // how forEach behind the scenes 
        Consumer<Integer> consumer =  (n) ->  System.out.println(n);

        System.out.println("print using consumer");
        nums.forEach(consumer); // we can do cosumer in seperate. 


        // stream is an interface
        Stream<Integer> s1 = nums.stream(); // we got all the list values into s1. it doesn't affect orginal number
        // only one times we can use one stream
        s1.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n)); // it gives error 

        Stream<Integer> s2 = nums.stream();

        // use filter
        System.out.println("filtered value using stream");
        Stream<Integer> s3 = s2.filter(n -> n % 2 == 0);
        Stream<Integer> s4 = s3.map(n -> n * 2);
        int sumEven = s4.reduce(0, (c, elm) -> c + elm);
        System.out.println(sumEven);

         // one line Stream
        int res =  nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .reduce(0, (c, elm) -> c + elm);
        System.out.println("Result of event number summation with double value: " + res);
        // s4.forEach(n -> System.out.println(n));

        // filter how works
        // make a Predicate object then pass to filter
        Stream<Integer> s10 = nums.stream();
        Predicate<Integer> pd = new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n % 2 == 1)
                    return true;
                else 
                    return false;
            }
        };

        Stream<Integer> s11 = s10.filter(pd);
        // s11.forEach(n -> System.out.println(n));

        // sorted after filtering
        System.out.println("sorted value after odd number filtering");
        Stream<Integer> s12 = s11.sorted();
        s12.forEach(n -> System.out.println(n));


        // parallel filtering using Threads
        // we have to use nums.parallelStream()
        System.out.println("parallel Streaming with filtering");
        Stream<Integer> filtered = nums.parallelStream().filter(n -> n % 2 == 1);
        filtered.forEach(n -> System.out.println(n));
     }
}
