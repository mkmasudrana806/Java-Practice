import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Map hold key value pairs instead of index value
        Map<String, Integer> students = new HashMap<String, Integer>();

        // put() method means, if already present, update it else add it
        students.put("Masud", 29);
        students.put("rana", 27);
        students.put("Sheik", 26);

        System.out.println(students); // {Sheik=26, Masud=29, rana=27}
        System.out.println(students.get("Masud")); // 29

        // HashMap store unique keys, 
        students.put("Masud", 100);
        System.out.println(students);

        // get() method and for..each loop
        // students.keySet() gives array of keys
        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }


        // students.values() return array of values of HashMap
        for(int num : students.values()){
            System.out.println(num);
        }

        // HashTable implementation, synchronized
        Map<String, Integer> stu = new Hashtable<>();
        stu.put("shamoli", 10);
        stu.put("rahman", 5);
        stu.put("soton", 29);

        System.out.println(stu);
    }
}
