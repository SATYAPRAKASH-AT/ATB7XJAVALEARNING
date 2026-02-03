package Practicequestions;


public class person2 {

    String name;
    String email;
    int age;
 person2(){
     name = "Satyapraksah";
     email = "satya@gmail.com";
     age= 33;


 }
    public person2(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    void person2(){
        System.out.println("default");
    }
    void printDetails(){
        System.out.println("name ->" + name);
        System.out.println("age ->" + age);
        System.out.println("email ->" + email);
    }
}

