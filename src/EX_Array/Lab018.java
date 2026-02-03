package EX_Array;

public class Lab018 {
    public static void main(String[] args) {
        String s1 ="Satya"; // SCP  string constant pool
        String s2 = new String("Satya");   //object area

    StringBuffer stringBuffer= new StringBuffer("Satya");
    stringBuffer.append(" Prakash");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Satya");
        stringBuilder.append(" Prak");
        System.out.println(stringBuilder);
    }
}
