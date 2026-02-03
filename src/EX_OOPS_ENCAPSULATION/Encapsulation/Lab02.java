package EX_OOPS_ENCAPSULATION.Encapsulation;

public class Lab02 {
    public static void main(String[] args) {

        vwoLogin1 v1 = new vwoLogin1("admin","admin123");
        //v1.username = "admin";
        String username = v1.getUsername();
        System.out.println(username);
        String password = v1.getPassword(true);
        System.out.println(password);
        v1.setPassword("satya" , true);
        System.out.println(password);

    }
}
    class vwoLogin1{
        private String username;
        private String password;

        public vwoLogin1(String username, String password) {
            this.username = username;
            this.password = password;
}

        public String getUsername() {
            return username;
        }

        public String getPassword(boolean isauth) {
            if(isauth){
                return password;
            }
            else
                {
                    return "not allowed";
        }}

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password, boolean isAuth) {
            if(isAuth) {
                this.password = password;
            }
            else {
                System.out.println("Not Allowed");
            }
        }
    }
