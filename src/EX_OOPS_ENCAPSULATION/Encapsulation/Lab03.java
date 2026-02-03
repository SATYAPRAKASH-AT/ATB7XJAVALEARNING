package EX_OOPS_ENCAPSULATION.Encapsulation;

public class Lab03 {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank("pramod", 100);
        System.out.println(i.getBal());
        i.setBal(-100);
        //i.name = "Admin";
        i.setName("Satya");
        System.out.println(i.getBal());
        System.out.println(i.getName());

    }
}

