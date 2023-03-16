package OOP.LawOfDemeter;

// Java Program to illustrate Law of Demeter or Least knowledge principle
// where Method M can call objects created within M

// Importing all input output classes
import java.io.*;

// Class 1 : Helper class
class Human1 {
    // Method of this class
    public void speak() {
        System.out.println("Hello Dog");
    }
}

// Class 2 : helper class
class Dog1 {
    // Method of Dog class
    public void M() {

        // We can use object P as it is local to this method and satisfy 3rd law
        Human1 P = new Human1();
        P.speak();
        System.out.println("Barks-_-");
    }
}

// Class 3 : Main class
class GFG {
    public static void main (String[] args) {

        // Creating an object of Dog class in the main() method
        Dog1 obj = new Dog1();

        // Method M can call objects created within M
        obj.M();
    }
}