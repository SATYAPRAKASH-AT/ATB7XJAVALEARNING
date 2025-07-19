package ex_12072025;

public class Lab20 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++ + ++a);

        // 11+11+13
        System.out.println(++a + a++ + a++);

        //11+11+11
        System.out.println(++a + ++a);

        // 11+12+12
    }
}
