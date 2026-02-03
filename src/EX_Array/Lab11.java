package EX_Array;

public class Lab11 {
    public static void main(String[] args) {
        int number[] = {22, 32, 21, 54,90,34};

        //find the largent int he array
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        // int j= 0{
        // while (j<number.length){
        //if (number[i]>max){
        //  max= number[i];}
        System.out.println(max);


    }
}

