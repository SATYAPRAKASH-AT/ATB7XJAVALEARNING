package Practicequestions;

public class PRAC01 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("I am done");
    }
}
