package Practicequestions;

public class Largestelementin_2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int largestelement= arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>largestelement){
                    largestelement=arr[i][j];

                }


            }

        }System.out.println(largestelement);



    }
}
