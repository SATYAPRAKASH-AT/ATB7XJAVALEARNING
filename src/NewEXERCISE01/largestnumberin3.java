package NewEXERCISE01;

import java.util.Scanner;

public class largestnumberin3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

//

        // Using nested ternary operator

        int largest = (a > b) ? (Math.max(a, c)) : (Math.max(b, c));
        System.out.println("the largest number is " + largest);
    }
}
