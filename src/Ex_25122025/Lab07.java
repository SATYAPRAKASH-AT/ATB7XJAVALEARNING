package Ex_25122025;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        if (number >20){
            System.out.println("Given nmumber is greateer than 20");
        } else if (number<10) {
            System.out.println("given numbner is less than 10");
        }else {
            System.out.println("number is between 10-20");

        }
    }
}
