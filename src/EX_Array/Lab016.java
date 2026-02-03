package EX_Array;

public class Lab016 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr[i].length; j++) {   // columns
                System.out.print(arr[i][j] +" ");
            }
            System.out.println(); // new line after each row
        }
    }
}
