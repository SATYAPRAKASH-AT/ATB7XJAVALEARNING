package NewEXERCISE01;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();

        System.out.println("Enter the second number");
        int number2 = sc.nextInt();

        if (number1>number2){
            System.out.println("The greater number is: " + number1);
        } else if (number2>number1) {
            System.out.println("The greater number is: " + number2);
        } else {
            System.out.println("Both number are equal");

        }
        sc.close();
    }
}
