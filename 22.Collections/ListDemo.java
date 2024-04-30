import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // by default all the values are object.
        Collection num = new ArrayList<>();

        // we can specify collection type
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(234);
        nums.add(23);
        nums.add(92);

        // no need to print this ArrayList collection using loop. we can print directly
        System.out.println(nums);


        // use List to work with index value. Collection doesn't support index value
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers.get(1)); // 3 at index 1
        System.out.println(numbers.indexOf(3)); // index of 3 is 1
         
    }
}
