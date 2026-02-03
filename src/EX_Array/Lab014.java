package EX_Array;

public class Lab014 {
    public static void main(String[] args) {
        //double the array
        int array[] = {21,32,8,3,25,};
        int array2[] = new int[5];
        for (int i = 0; i <array.length ; i++) {
            array2[i]= array[i]*2;


        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);

        }

    }
}
