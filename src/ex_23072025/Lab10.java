package ex_23072025;

public class Lab10 {
    public static void main(String[] args) {
        // new operator is always available to non primitve data tupes .ie string, ararys calss
        String password = "Sattu2";
        String pass= password.toLowerCase();
        System.out.println(pass);

        System.out.println(pass== password);
        System.out.println(pass.equalsIgnoreCase(password));
        System.out.println(pass.equals(password));
        System.out.println(password.substring(0,3));
    }
}
