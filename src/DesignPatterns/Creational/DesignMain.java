package DesignPatterns.Creational;
/*
* Creational
*   Singleton
*   Builder
*   Factory
*       Simple Factory
*       Factory Method
*
*
*
* */
public class DesignMain {
    /*
    * What are design patterns?
    *
    * Solution for common design problems
    *
    * */

    public static void main(String[] args) {
        Singleton.CreateObject();

        Singleton s1 = Singleton.CreateObject();
        Singleton s2 = Singleton.CreateObject();
        Singleton s3 = Singleton.CreateObject();
    }

}
