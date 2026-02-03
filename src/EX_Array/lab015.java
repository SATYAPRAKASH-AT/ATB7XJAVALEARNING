package EX_Array;

public class lab015 {
    public static void main(String[] args) {

        // 2d arrays
        //matrix rows and columns
        //rows = horizontal
        //columns = vertical

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr[i].length; j++) {   // columns
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(); // new line after each row
        }
    }
}

