package OOP.Inheritance;

public class Bicycle {
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}

// derived class (=subclass of Bicycle)
class MountainBike extends Bicycle {
    // subclass field
    public int seatHeight;

    // constructor
    public MountainBike(int startGear, int startSpeed, int startCadence, int startHeight) {
        // invoke base-class constructor
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    // overriding toString() method of Bicycle to print more into
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

// driver class
class Test {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 10, 25, 10);
        System.out.println(mb.toString());
    }
}
