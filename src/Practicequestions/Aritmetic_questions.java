package Practicequestions;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Aritmetic_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("Enter the thirid number");
        int c= sc.nextInt();
        int i =3;
        int average = (a+b+c)/3;
        int sum= a+b;
        int sub = a-b;
        int prod = a*b;
        int remain = a%b;
        int quotient = a/b;

        System.out.println("Sum of Entered number are " + sum);
        System.out.println("remainder of Entered number are " + remain);
        System.out.println("Quotient of Entered number are " + quotient);
        System.out.println("Average of Entered number are " + average);

    }
}
