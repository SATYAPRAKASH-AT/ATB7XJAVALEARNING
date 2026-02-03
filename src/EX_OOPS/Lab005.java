package EX_OOPS;

public class Lab005 {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.name = "Tesla";
        tesla.model = "Model 3";

        tesla.reverse();
        tesla.speedTop();

        Car volvo = new Car();
        volvo.name = "Volvo";
        volvo.model = "XC90";

        volvo.reverse();
        volvo.speedTop();



    }
}
