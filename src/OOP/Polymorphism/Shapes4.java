package OOP.Polymorphism;
/*
Method Overloading

: the process that can create multiple methods of the same name
in the same class, and all the methods work in different ways.
 */


class Shapes4 {
    public void area() {
        System.out.println("Find area ");
    }
    public void area(int r) {
        System.out.println("Circle area = "+3.14*r*r);
    }

    public void area(double b, double h) {
        System.out.println("Triangle area="+0.5*b*h);
    }
    public void area(int l, int b) {
        System.out.println("Rectangle area="+l*b);
    }


}

class Main4 {
    public static void main(String[] args) {
        Shapes4 myShape = new Shapes4();  // Create a Shapes object

        myShape.area();
        myShape.area(5);
        myShape.area(6.0, 1.2);
        myShape.area(6, 2);

    }
}
