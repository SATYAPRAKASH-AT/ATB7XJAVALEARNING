package EX_OOPS_ENCAPSULATION.superthiskeyword;

public class Lab03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}


class Student extends Person{
    // is A relation - inheritance
    void message(){
        System.out.println("I am Student message");
    }

    void display(){
        this.message();
        //super.message();
    }


}

class Person{
    void message(){
        System.out.println("I am person message");
    }
}
