package ConstructorChaining;

public class Referral  extends  Student{
    public Referral(String name, String email, String password) {
        super(name, email, password);
        System.out.println("Referral class");
    }
}
