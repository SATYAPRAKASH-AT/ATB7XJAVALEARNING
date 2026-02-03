package EX_OOPS_ENCAPSULATION.accessModifiers.Crimnal;

import EX_OOPS_ENCAPSULATION.accessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10);
        System.out.println(cop.gun);
       // cop.canIShoot();  // canIShoot function is public/ if it will be private then not accessible
    }

}
