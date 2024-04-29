// when we need constant values, we can create an enum. all the variable inside enum are object
// => these has index start with 0 and so on...
enum Status{
    Running, Failed, Pending, Success
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s); // Running

        // get index value
        System.out.println(s.ordinal()); // return index of Running = 0

        // looping
        Status[] ss = Status.values(); // return array of indexes
        for(Status x : ss){
            System.out.println(x);
        }

        // conditional using
        if(s == Status.Running){
            System.out.println("All are Good, Application Running");
        }else if(s == Status.Failed){
            System.out.println("Failed unexpectedly");
        }else if(s == Status.Pending){
            System.out.println("Pending, wait please...");
        }else{
            System.out.println("Done");
        }

        // we can also use switch case
        // case value is directly enum member
        
    }
}
