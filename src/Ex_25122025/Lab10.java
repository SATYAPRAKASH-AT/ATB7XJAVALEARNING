package Ex_25122025;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        // Triangle classifier
        //program that classifies based on the sides of the triangle
        //all sides are equal than it is equilateral
        //two sides equal then isocels a
        //sode 1 sde 2 side 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1, side 2, side 3 of the traingle");
        int Side1 = sc.nextInt();
        int Side2 = sc.nextInt();
        int Side3 = sc.nextInt();
        if( Side1 == Side2 && Side1==Side3 && Side2==Side3){
            System.out.println("Equilateral traingle");
        }
        else if ((Side1 == Side2) || (Side1==Side3) || (Side2==Side3))
        {
            System.out.println("Isoceles traingle");
        }else{
            System.out.println("Scalene");


        }}}





