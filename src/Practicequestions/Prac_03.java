package Practicequestions;

import java.util.Scanner;

public class Prac_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number  = sc.nextInt();
        String num = (number % 2==0) ? "even" : "odd";
        System.out.println(num);
    }
}
