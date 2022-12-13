package ConstructorChaining;

public class User {
    public User(String name, String email, String password) {
        //this();
        Name = name;
        Email = email;
        Password = password;

        System.out.println("User class");
    }
    public User(){
        this("BK","email","****");
        System.out.println("User default");
    }

    public  String Name;
    public String Email;
    public String Password;


}
