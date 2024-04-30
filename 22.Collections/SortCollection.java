import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollection {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(20);
        nums.add(23);
        nums.add(10);
        nums.add(32);
        nums.add(29);

        // sort ascending order
        Collections.sort(nums);
        System.out.println(nums);

        // comparator is an interface, we can write our own logic

        // sort based on own logic, logic based on last digit of number
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                // return 1 means swap, -1 means no swap
                if(i%10 > j%10 ) 
                return 1;
                else 
                return -1;
            }
        };

        // pass comparator to the sort() method.
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
