package EX_Switch02012026;

import java.util.Scanner;

public class lab08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char");
        char user_input = sc.next().charAt(0);

        switch(user_input)
        {
            case 'a','e','i','o','u' -> System.out.println("The entered char is a vowel");
            default -> System.out.println("Entered char is consonant");



        }
    }
}
