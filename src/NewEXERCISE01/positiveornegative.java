package NewEXERCISE01;

import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        
        if (number1>0){
            System.out.println("the entered number is positive");
        } else if (number1<0) {
            System.out.println("The entered number is negative");
            
        } else  {
            System.out.println("The enterred number is zero");

        }
        sc.close();

    }
}
