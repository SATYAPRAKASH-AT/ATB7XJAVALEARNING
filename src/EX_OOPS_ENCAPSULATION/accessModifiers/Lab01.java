package EX_OOPS_ENCAPSULATION.accessModifiers;

public class Lab01 {
    public static void main(String[] args) {

       P Obj = new P();
       Obj.m1();
       Obj.m2();


    }
}

class P{
    void m1(){
        System.out.println("M1");
    }
    void m2(){
        m1();
        System.out.println("M2");
    }
}