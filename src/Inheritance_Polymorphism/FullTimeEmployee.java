package Inheritance_Polymorphism;

public class FullTimeEmployee extends Employee{
    public void PrintName()
    {
        System.out.println("No Name");
        Employee employee = new Employee();
        System.out.println(employee.Name);
    }
}
