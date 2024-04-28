public class Demo {
    public static void main(String[] args) {
            int nums[] = {3, 9, 5, 0, 2 };
            nums[1] = 10; 
            System.out.println(nums[1]); // 10

            int numbers[] = new int[4]; // all the element assigned to zero 0 by default
            numbers[0] = 4;
            numbers[1] = 8;
            numbers[2] = 3;
            numbers[3] = 7;

            // System.out.println(numbers[0]);
            // System.out.println(numbers[1]);
            // System.out.println(numbers[2]);
            // System.out.println(numbers[3]);

        // instead use loop to print array elements
            for(int i = 0; i < numbers.length; i++){
                System.out.println(numbers[i]);
            }

        // multi dimensional arrays
        int number[][] = new int[3][4]; // 3 internal array and each array has 4 elements
        // by default all elements 0
        /*
        0 0 0 0 
        0 0 0 0 
        0 0 0 0 
         */
        // fill up element using random library
         for( int i = 0; i < number.length; i++){
            for( int j = 0; j < number[i].length; j++ ){
                number[i][j] = (int) (Math.random() * 100 );    
            }
        }   

        for( int i = 0; i < number.length; i++){
            for( int j = 0; j < number[i].length; j++ ){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }   

        System.out.println("Enhanched loop");
        // enhanced loop
        for (int n[] : number){
            for(int elm : n){
                System.out.print(elm + " ");
            }
            System.out.println();
        }

        // drawbacks of array:
        int arr[] = new int[5];
        // Note: when we use new keyword,it create a memory space into heap memory.
        // array is contigous memory location, size is fixed.

        // to solved this. we have collection
    }
}
