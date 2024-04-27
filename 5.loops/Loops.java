public class Loops {
    public static void main(String[] args) {
        // while loop: run only when condition is true
        int i = 1;
        while(i<=10){
            System.out.println("I love Java Programming");
            i++;
        }

        // do..while: always run 1st time. then check condition
        i = 1;
        do{
            System.out.println("I love DSA with Java");
            i++;
        }while(i<=10);


        // for loop: initialize; condition; increment/decrement three conditon at single line
        for(i=0; i<10; i++){
            System.out.println("I love OOPS with Java");
        }

        // initialize and increment part is optional
        i = 1;
        for( ;i<10; ){
            System.out.println("I love backend with Java");
            i++;
        }

        // when to use for, while and do while loop? 
        // for loop: where initialization, condition and increment are clear
        // while: where termination condtion is not know like reading a file. terminate when reach end of file.
        // do while: special case when 1st time need to run. 
    }
}
