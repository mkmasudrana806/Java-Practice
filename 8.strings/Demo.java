public class Demo {
    public static void main(String[] args) {
        // String name = "Masud rana"; // this works, but really this is not right approach, it also create object.
        // as String is a class. to create a object string, we have use new keyword

        // String name = new String();
        // System.out.println(name); // empty
        // pass data to constructor String() 

        String name = new String("Masud rana");
        System.out.println(name);

        // as String is class, it has some methods
        System.out.println(name.charAt(0)); // str.charAt(index)
        System.out.println(name.concat(" Sheikh")); // str.charAt("new string")
        name = name + " Developer"; // string is immutable, means here new string reference is created in heap memory. and name now locate newly created string reference. previous reference is going to garbage collection.

        // string is immutable in Java. means orginal string is not changeable.
        // mutable string means string is changeable. it doesn't create new string reference.
        System.out.println(name);

        // here both reference same location. don't create different string reference. they store ins string constants or string pool in heap memory
        String str1 = "Masud rana";
        string str2 = "Masud rana";

        // we can achive mutability using StringBuffer and StringBuilder

    }
}
