package Practicequestions;

import java.util.Scanner;

public class prac_04 {
    public static void main(String[] args) {
        //    Practice -
        //    Prime Number
        //    Swap Two Numbers
        //    String reverse
        //    Take User input as array
        //    Maximum in Array
        //    Print diagonal Elements 2D array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        prime(number);   // function call
    }

    // function to check prime
    static void prime(int number) {

        if (number <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }

        System.out.println("It is a prime number");
    }
}
