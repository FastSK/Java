package OOP.LawOfDemeter;// Java Program to illustrate Law of Demeter or
// Least knowledge principle
// where
// Method M of an object O can invoke
// the method of O itself

// importing input output classes
import java.io.*;

// Java Program to illustrate Law of Demeter or
// Least knowledge principle
// where
// Method M of an object O can invoke the method of O itself


// Class 1
// Helper class
class Helper {

    // Method of this class
    void M()
    {

        // Print statement whenever method is called
        System.out.println("hello from M()");

        // 'this' keyword is valid as method named-
        // anotherMethod() is encapsulated in the same class
        this.anotherMethod();
    }

    // Method of this class
    void anotherMethod()
    {

        // Print statement whenever method is called
        System.out.println(
                "I am anotherMethod() of same class");
    }
}

// Class 2
// Main class
class GFG1 {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of above Helper class and
        // in the main() method
        Helper obj = new Helper();

        // Method M of an object O can invoke
        // the method of O itself
        obj.M();
    }
}