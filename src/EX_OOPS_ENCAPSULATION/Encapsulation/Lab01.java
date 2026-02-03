package EX_OOPS_ENCAPSULATION.Encapsulation;

public class Lab01 {
    public static void main(String[] args) {
    vwoLogin v1 = new vwoLogin("admin", "admin123");
    // Hidden
    //System.out.println(v1.password);
    //v1.username  = "pramod";
      // v1.password = "admin12";
    System.out.println(v1.username);

}
}


class vwoLogin {
    public String username;
    private String password;

    public vwoLogin(String password, String username) {
        this.password = password;
        this.username = username;


    }}

