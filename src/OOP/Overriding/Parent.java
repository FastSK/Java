package OOP.Overriding;

/***
 * Overriding
 * If an object of a parent class is used to invoke the method, then
 * the version in the parent class will be executed.
 * But if an object of the subclass is used to invoke the method,
 * then the version in the child class will be executed.
 */

// Base class
public class Parent {
    void show() {
        System.out.println("Parent'show()");
    }
}

// Inherited class
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}

// Driver class
class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();

        // If a parent type reference refers to a Child object,
        // Child's show() is called.
        Parent obj2 = new Child();
        obj2.show();
    }
}
