public class Conditonal {
    public static void main(String[] args) {
        int x = 28;
        int y = 102;

        // if...else: check two condition 
        if(x > y)
        System.out.println("x is larger than y");
        else 
        System.out.println("y is larger than x");


        // if...else if...else: check three condition
        int z = 8;
        if(x > y && x > z)
        System.out.println("x is larger than y and z");
        else if (y > z && y > x)
        System.out.println("y is larger than z and x");
        else 
        System.out.println("z is larger than x and y");

        // ternary operator alternative to if...else
        int num = 23;
        String ans = num % 2 == 0 ? "even" : "odd"; // if true, first value will store, else second value
        System.out.println(ans); 

        // switch case : print day name based on day number
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5: 
                System.out.println("Wednesday");
                break;
            case 6: 
                System.out.println("Thusday");
                break;
            case 7: 
                System.out.println("Friday");
                break;
            default:
                System.out.println(
                    "Enter correct day number"
                );
                break;
        }

        // switch case more smartly when more case return same result
        // vowel and consonant checking
        char ch = 'U';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowel");
                break;
            
            default:
            System.out.println("Consonant");
                break;
        }

    }
}
