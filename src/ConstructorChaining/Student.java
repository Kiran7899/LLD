package ConstructorChaining;

public class Student extends User{

    public Student(String name, String email, String password) {
        //super(name, email, password);
        super();
        System.out.println("Student class");
    }
}
