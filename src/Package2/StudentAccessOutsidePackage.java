package Package2;

import Package1.Student;

public class StudentAccessOutsidePackage {
    Student student = new Student();
    public StudentAccessOutsidePackage(){
        student.Email = "";
    }
}
