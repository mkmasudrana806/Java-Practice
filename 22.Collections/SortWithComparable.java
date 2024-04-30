// implements comparable interface, it has compareTo method, return 1 for swap, -1 for noswap. 
// no need to use comparator in sort() method

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public String toString(){
        return "Student [age = " + age + ", name = " + name + "]"; 
    }

    // implements compareTo method
    public int compareTo(Student that){
        return this.age > that.age ? 1 : -1;
    }
}


public class SortWithComparable {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<Student>();
        stu.add(new Student(20, "Masud"));
        stu.add(new Student(21, "Rana"));
        stu.add(new Student(13, "Sheik"));
        stu.add(new Student(57, "Shihab"));


        // without comparator, i have implemented compareTo() method into class
        Collections.sort(stu);
        System.out.println(stu);
    }
}
