import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetDemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(234);
        nums.add(23);
        nums.add(92);
        nums.add(32);
        nums.add(32);
        nums.add(92);

        System.out.println(nums ); // [10, 23, 32, 92, 234] sorted + unique
    }
}
