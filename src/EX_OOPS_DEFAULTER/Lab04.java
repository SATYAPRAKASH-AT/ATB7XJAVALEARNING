package EX_OOPS_DEFAULTER;

public class Lab04 {
    public static void main(String[] args) {
        ATBPerson satyaRef = new ATBPerson("Chandu");
        // objRef1.name = "Amit";
        System.out.println(satyaRef.courseName);
        System.out.println(satyaRef.isMarried);
        System.out.println(satyaRef.name);
        // DC are created to assign the value of Instance variable of the class.

        // DC -> Problem -> I can't assing my values to the Instance


        ATBPerson swapnilRef = new ATBPerson();
        System.out.println(swapnilRef.name);
        System.out.println(swapnilRef.courseName);


   ATBPerson satyRef = new ATBPerson();
        System.out.println(satyRef.name);
        System.out.println(satyRef.courseName);
        System.out.println(satyRef.phone);


}}

