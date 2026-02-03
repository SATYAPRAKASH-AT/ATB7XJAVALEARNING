package EX_Array;

public class Lab12 {
    public static void main(String[] args) {
     int number[] = {22,58,65,54,11,87};
     int min= number[0];
        for (int i = 0; i<number.length ; i++) {
            if (number[i]<min){
                min=number[i];
            }

        }
        System.out.println(min);

    }
}
