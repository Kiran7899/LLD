package Inheritance_Polymorphism;

public class MainClass {


    public static void main(String[] args) {
        FullTimeEmployee FTE = new FullTimeEmployee();
        Employee employee = new FullTimeEmployee();
        Employee employee1 = new Employee();
        FTE.PrintName();
        employee.PrintName();
        employee1.PrintName();
    }
}
