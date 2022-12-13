package DesignPatterns.Creational;

public class Singleton {
    private static Singleton obj = null;
    private Singleton(){

    }

    public static Singleton CreateObject()
    {
        if(obj == null)
        {
            obj = new Singleton();
        }
        return obj;
    }
}
