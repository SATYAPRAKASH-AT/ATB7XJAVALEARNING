package EX_OOPS_ENCAPSULATION.accessModifiers.Police;

public class Cop {
        public int gun; // public access by anyone
        private String idCard; // Privat - only available to the cop

        public Cop(int gun){
            this.gun = gun; // PC
        }

        public void canIShoot(){
            System.out.println("Of-course, Shoot!");
        }

    }

