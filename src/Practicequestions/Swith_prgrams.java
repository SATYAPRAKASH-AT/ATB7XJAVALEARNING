package Practicequestions;

import java.util.Scanner;

public class Swith_prgrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the char to perform the action +,-,*");
        char opreator = sc.next().charAt(0);
        switch (opreator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("enter the correct operation");

        }sc.close();
    }
}
