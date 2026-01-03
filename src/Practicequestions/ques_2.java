package Practicequestions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number first: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number ");
        int b = sc.nextInt();

        int largest = a <= b ? a : b;


        System.out.println("The the smallest between the input numbers is " + largest);

        

    }
}
