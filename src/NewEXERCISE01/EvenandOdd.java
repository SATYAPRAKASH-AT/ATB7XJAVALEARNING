package NewEXERCISE01;

import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number1 = sc.nextInt();
        if (number1%2==0){
            System.out.println("The entered number is even");
        }else {
            System.out.println("The entered number is odd");
        }
    }
}
