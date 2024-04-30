/**
 * Set give unique value, it doesn't maintain sequence. HashSet also doesn't give index
 */
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
         // we can specify collection type
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(10);
        nums.add(234);
        nums.add(23);
        nums.add(92);
        nums.add(32);
        nums.add(32);
        nums.add(92);

        System.out.println(nums );

        for(int n : nums){
            System.out.println(n);
        }

        System.out.println(nums.isEmpty());

    }
}
