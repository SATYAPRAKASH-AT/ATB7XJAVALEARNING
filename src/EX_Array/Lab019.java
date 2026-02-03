package EX_Array;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args) {
        //find the palidrome

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the letter will tell you if is it a palindorme");
        String user_input = sc.next();

        StringBuilder sb= new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if(user_input.equals(rev_user_input)){
            System.out.println("It is palindrome");

        }else {
            System.out.println("it is not");
        }

    }
}
