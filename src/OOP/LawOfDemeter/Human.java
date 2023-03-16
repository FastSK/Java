package OOP.LawOfDemeter;


// Java Program to illustrate Law of Demeter or Least knowledge principle
// where Method M can call methods of any parameter P

// Importing all input output classes
import java.io.*;

// Class 1
// Helper class
class Human{
    // Method of Human class
    public void speak() {
        System.out.println("Hello Dog");
    }
}

// Class 2
// Helper class
class Dog{
    // Method of Dog class
    public void M(Human P) {
        // We can call methods of object passed in our parameter
        P.speak();
        System.out.println("Bark(_-_)");
    }
}

// Class 3
// Main class
class Main {
    // Main driver method
    public static void main (String[] args) {
        // Creating object of Human Class and Dog class inside the main method
        Human h = new Human();
        Dog obj = new Dog();

        // Method M calling any parameter P
        // M-> method of Dog class
        // h-> Human class object
        obj.M(h);
    }
}
