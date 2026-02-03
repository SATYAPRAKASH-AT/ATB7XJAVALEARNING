package EX_EXCEPTION;

public class Lab06 {
    public static void main(String[] args) {
        final double pi = 3.14;
        try {
            int a = 0;
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Exit");
        } finally {
            System.out.println("I am final");
        }
    }

}
