package Ex_25122025;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        //grade calculator
        // wrtie a program that explain the grade based on the number
        // A: 90-100
        //B:  80-90
        //c: 70-80
        //d : 60-70
        //e : 50-60

        System.out.println("Enter the marks");
        Scanner sc=  new Scanner(System.in);
        int marks = sc.nextInt();
        char grade ='F';
        if (marks >=90 && marks<=100){
            grade = 'A';
        } else if (marks >=80 && marks<=89) {
            grade = 'B';
        } else if (marks >=70 && marks <=79) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
        sc.close();

    }
}
