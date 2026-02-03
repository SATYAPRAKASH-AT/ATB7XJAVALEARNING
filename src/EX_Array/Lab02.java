package EX_Array;

public class Lab02 {
    public static void main(String[] args) {
        int[] ages = {22,32,52,45,74};
        int[] ages2 = new int[5];
        //new operator
        System.out.println(ages2[2]);
        ages2[0] =12;

        ages2[1] =32;
        System.out.println(ages2[1]);

        String[] breakfast_itms = {"Milk", "tea", "egg", };
        System.out.println(breakfast_itms.length);
        System.out.println(breakfast_itms[1]);
    }
}
