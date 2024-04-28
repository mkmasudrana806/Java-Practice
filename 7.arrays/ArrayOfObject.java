class Student{
    String name;
    int id;
    int mark;
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Masud Rana";
        s1.id = 213;
        s1.mark = 4;
        
        Student s2 = new Student();
        s2.name = "sheikh";
        s2.id = 214;
        s2.mark = 5;

        Student s3 = new Student();
        s3.name = "soton";
        s3.id = 215;
        s3.mark = 6;

        System.out.println(s1.name);
         // need to manually create object then assign to references array
        // an array it can holds student references
        Student students[]  = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + ": " + students[i].mark);
        }

        // using enhanched for each loop
        for(Student student : students){
            System.out.println(student.name);
        }
    }
}
