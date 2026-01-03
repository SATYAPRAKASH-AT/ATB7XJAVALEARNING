package EX_Switch02012026;

import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = sc.nextInt();
        int result = marks / 10;
        switch (result) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
        }
    }
}
