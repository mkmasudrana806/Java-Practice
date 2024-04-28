public class JaggedArray {
    public static void main(String[] args) {
        // in 2D array, each inner array size is not equal to all the array. they can have different size

        int nums[][] = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                    nums[i][j] = (int) (Math.random() * 100 );
            }
        }

        for (int num[] : nums){
            for (int elm : num){
                    System.out.print(elm + " " );
            }
            System.out.println();
        }

        
    }
}
