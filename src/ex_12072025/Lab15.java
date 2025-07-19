package ex_12072025;

public class Lab15 {
    public static void main(String[] args) {
        int a=300;
        //byte b=a; // INVALID – Implicit Casting
        byte b = (byte)a; // VALID – Explicit Casting
        System.out.println(b);

    }
}
