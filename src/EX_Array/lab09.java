package EX_Array;

import java.util.Scanner;

public class lab09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks[] = new float[3];
        System.out.println("Enter the marks of 1st subject");
        marks[0]= sc.nextFloat();
        System.out.println("Enter the marks of second subecjt");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks of 3rd subecjt");
        marks[2]= sc.nextFloat();
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]<30){
                System.out.println("GFailed int this subject");

            }
            System.out.println(marks[i]);
            
        }

    }
}
