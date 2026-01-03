package Ex_25122025;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        // max numebr in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("first number is " +a);
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("the second number is " +b);

        if (a>b) {
            System.out.println("the highest number is -> " + a);
        }else {
            System.out.println("the highest number is -> " +b);
        }
        sc.close();
    }
}
