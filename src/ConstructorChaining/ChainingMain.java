package ConstructorChaining;

public class ChainingMain {
    public static void main(String[] args) {
        Referral referral = new Referral("Kiran","kiran8","");
        System.out.println(referral.Name + " " + referral.Email + " " + referral.Password);
        System.out.println("From Main");
    }

}
