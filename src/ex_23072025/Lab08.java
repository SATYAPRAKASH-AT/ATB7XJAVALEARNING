package ex_23072025;

public class Lab08 {
    public static void main(String[] args) {
        String s1 = new String("Satya");

        String s2 = new String("Satya");
        String s3 = new String("Satya");
        String s4 = new String("Satya");

        System.out.println(s1==s2); // this will check for the ref where it has stored
        System.out.println(s1.equals(s2)); // this will check for the content
        String a1= "Satuu";
        String  a2 = "Satuu";
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));

    }}
