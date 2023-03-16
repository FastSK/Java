package OOP.Polymorphism;
/*
Method Overriding

: the process when the subclass or
a child class has the same method as declared in the parent class.
 */

class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is moving");}
}
//Creating a child class
class Car2 extends Vehicle{
    //defining the same method as in the parent class
    void run(){System.out.println("car is running safely");}

    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.run();

        Car2 obj = new Car2();//creating object
        obj.run();//calling method
    }
}
