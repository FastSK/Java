package OOP.Encapsulation;

/**
 * Encapsulation
 * To make sure that "sensitive" data is hidden from users
 * 1. declare class variables/attributes as private
 * 2. provide public get and set methods to access and update the value of a private variable.
 *
 * @since 2/22/2023
 */


public class MyClass {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}
