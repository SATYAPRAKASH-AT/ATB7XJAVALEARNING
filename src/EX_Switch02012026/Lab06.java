package EX_Switch02012026;

public class Lab06 {
    public static void main(String[] args) {
        int itemcode = 2;
        switch (itemcode){
            case 1,2,3 :
                System.out.println("it is a elecric product");
                break;
            case 5,6,7:
                System.out.println("It is stationery otem");
            default:
                System.out.println("default");
        }
    }
}
