import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public String toString(){
        return "Student [age = " + age + ", name = " + name + "]"; 
    }
}


public class ObjectArraySort {
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<Student>();
        stu.add(new Student(20, "Masud"));
        stu.add(new Student(21, "Rana"));
        stu.add(new Student(13, "Sheik"));
        stu.add(new Student(57, "Shihab"));

        for(Student s : stu){
            System.out.println(s);
        }

        // sort based on age
        // Comparator<Student> com = new Comparator<Student>(){
        //     public int compare(Student i, Student j) {
        //         if(i.age > j.age)
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        // usng lambda function. as Comparator functionalInterface
        Comparator<Student> com = ( i,  j) -> (i.age > j.age) ? 1 : -1;

        Collections.sort(stu, com);
        System.out.println(stu);
    }
}
