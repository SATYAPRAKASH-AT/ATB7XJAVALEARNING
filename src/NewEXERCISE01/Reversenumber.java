package NewEXERCISE01;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        String reversed =
                new StringBuilder(String.valueOf(number)).reverse().toString();


        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}
