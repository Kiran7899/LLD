package Inheritance_Polymorphism;

public class Employee {
    protected String Name;
    public String Email;

    public Employee(){
        Name = "Kiran";
        Email = "kiran7899@gmail.com";
    }
    public void PrintName()
    {
        System.out.println(Name + " " + Email);
    }
}
