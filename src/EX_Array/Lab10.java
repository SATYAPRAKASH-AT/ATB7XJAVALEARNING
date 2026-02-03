package EX_Array;

public class Lab10 {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("Fizzbuz");
            } else if (i%3==0) {
                System.out.println("Fizz");

            }else {
                System.out.println(i);
            }

        }
    }
}
