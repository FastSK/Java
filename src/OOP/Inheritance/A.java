package OOP.Inheritance;

/**
 * Class B is the derived class which inherit the property (add method)
 * of base class A
 */
class A {
    int a, b;
    public void add(int x, int y) {
        a = x;
        b = y;
        System.out.println("Addition : " + (a+b));
    }
}

class B extends A {
    public void sum(int x, int y) {
        add(x, y);
    }

    // Driver Code
    public static void main(String[] args) {
        B b1 = new B();
        b1.sum(10, 11);
    }
}
