package Ex_25122025;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        // Even or odd number fine
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        sc.close();
    }
}
