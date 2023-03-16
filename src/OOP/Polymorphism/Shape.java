package OOP.Polymorphism;
/*
Method Override : draw() method
runtime / dynamic  polymorphism
 */
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle1 extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Main1 {
    public static void main(String[] args) {
        // creating 2 instances of shape
        Shape s1 = new Circle1();
        Shape s2 = new Square();

        s1.draw(); // Output: "Drawing a circle"
        s2.draw(); // Output: "Drawing a square"
    }
}
