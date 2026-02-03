package Functions;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int r_sum= sumoftwonumber(num1, num2);
        System.out.println("sumo fthe num is " + r_sum);
        int r_sub= suboftwonumber(num1, num2);
        System.out.println("sumo fthe num is " + r_sub);

    }

   static int sumoftwonumber(int num1, int num2) {
       return num1 + num2;}
       static int suboftwonumber ( int num1, int num2){
           return num1 - num2;
       }
   }
