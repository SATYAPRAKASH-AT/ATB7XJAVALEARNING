package EX_STATICkey;

public class Lab04 {

// Nested Class

    class OC {
        int a = 10;

        class IC {
            void m2() {
                System.out.println("Hi, IC" + a);
            }
        }
    }
}
