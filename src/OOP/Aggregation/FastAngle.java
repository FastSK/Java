package OOP.Aggregation;

import javax.swing.*;

class FastAngle {
    void installFloor() {
        System.out.println("Installed");
    }
    void removeFloor(){
        System.out.println("Removed");
    }
}

class OperatingSystem {
    void bootUp() {
        System.out.println("bu");
    }
    void shutDown() {
        System.out.println("SD");
    }
}

class PowerSupply {
    void turnOn(){
        System.out.println("On");
    }
    void turnOff(){
        System.out.println("Off");
    }
}

class Computer {
    private OperatingSystem os = new OperatingSystem(); // composition
    private PowerSupply ps = new PowerSupply(); // composition
    private FastAngle fa; // reference only = potential for aggregation

    // constructor
    public Computer(FastAngle fa) {
        this.fa = fa;  // aggregation
        ps.turnOn();
        os.bootUp();
    }

    void floorStuff(){
        fa.installFloor();
    }

    void allDone() {
        os.shutDown();
        ps.turnOff();
    }
}

class TestMe{
    public static void main(String[] args) {
        FastAngle fa = new FastAngle();
        Computer c = new Computer(fa);
        c.floorStuff();
        c.allDone();
        c = null; // the computer object and all the composition objects are destroyed and
        //eligible for garbage collection
        fa.removeFloor(); // it's alive
    }

}

