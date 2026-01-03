package Practicequestions;

public class String_01 {
    // Method to find maximum value in 2D array
    public static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE; // smallest possible number
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 9, 6},
                {7, 5, 8}
        };

        int maxValue = findMax(numbers);
        System.out.println("Maximum value = " + maxValue);
        // O/P -> 9
    }
}

