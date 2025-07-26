package ex_23072025;

public class Lab07 {
    public static void main(String[] args) {
        String name = "Satya";
        String name1 = "Satya";
        System.out.println(name == name1);  // check the ref
        System.out.println(name.equals(name1)); // the the values instead of ref
        String name23 = new String("Satya");
        System.out.println(name.equals(name23)); // equal to func always check the values are same or not
        System.out.println(name==name23);  //and == check for ref always )
    }
}
