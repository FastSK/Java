package OOP.Inheritance;

/**
 * @source https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
 */

public class Vehicle {               // super class
    // protected access modifier is accessible in the same pkg and subclass
    protected String brand = "Hyundai"; // Vehicle attribute
    public void honk() {             // Vehicle method
        System.out.println("hoho");
    }
}

class Car extends Vehicle {
    private String modelName = "Tucson";  // Car attribute

    public static void main(String[] args) {
        // create a myCar object
        Car myCar = new Car();

        // Call the honk() method on the myCar object
        myCar.honk();

        // Display
        System.out.println(myCar.brand + ":" + myCar.modelName);
    }
}