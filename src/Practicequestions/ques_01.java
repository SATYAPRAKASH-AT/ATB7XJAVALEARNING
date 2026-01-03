package Practicequestions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ques_01 {
    public static void main(String[] args) {
//        int a =20;
//        int b =30;
//        int c =50;
//        int max = a>b ? b:a;
//        int min = b>c ? b:c;
//        // System.out.println(max);
//        System.out.println(min);
//        boolean result = 10<40 ? 10 > 40 : 40>10;
//        System.out.println(result);


        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

//        System.out.print("Enter the fourth number: ");
//        int d = sc.nextInt();

        // Using nested ternary operator

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        //int largest = (a > b) ? (a > c ? (a > d ? a : d) : (c > d ? c : d)) : (b > c ? (b > d ? b : d) : (c > d ? c : d));

        System.out.println("The largest number is: " + largest);

//        sc.close();
    }
}
