package ProtectedDemo;

public class B extends A{
    public B(){
        A a = new A();
        System.out.println(a.protectedValue);
    }

    public void fun(String str){

    }

}
