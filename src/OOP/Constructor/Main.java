package OOP.Constructor;

/**
 * constructor
 * special method that is used to initialize objects
 * set initial values for object attributes
 */

public class Main {
    int x;  // create a class attribute

    // create a class constructor for the Main class
    public Main() {
        x = 122; // set initial value for the class attribute
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
