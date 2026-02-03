package EX_OOPS_ENCAPSULATION.accessModifiers.Poly.methodloading;

public class Lab01 {
    Lab01(){

    }
    Lab01(int a){

    }
    Lab01(int a, int b){

    }
    Lab01(int a, String b){

    }


    // Method OverLoading -> multiple methods with same name, but different argument.
    // order also matters

    void Gift(String a){
        System.out.println("A is a String" +  a);
    }

    int Gift(int x){
        System.out.println("X is a Int" +  x);
        return x;
    }

    int Gift(float x){
        System.out.println("X is a Int" +  x);
        return 89;
    }

    void Gift(double x){
        System.out.println("X is a double" +  x);
    }

    void a(int pramod,float amit){

    }
    void a(float y,int x){

    }

    public static void main(String[] args) {
        Lab01 p = new Lab01();
        p.Gift(10);
        p.Gift("Pramod");
    }
}