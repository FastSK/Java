package OOP.Inheritance;

/** multiline documentation
 *
 */
// method overriding in java

// Base class
public class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child extends Parent {
    // this method overrides show() of Parent
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}


// Driver class
class Main {
    public static void main(String[] args) {
        Parent ojb1 = new Parent();
        ojb1.show();

        // Parent type reference refers to a Child object
        Parent obj2 = new Child();
        obj2.show();

        for (int i=3; i<9; i+=2){
            System.out.println("Case: " + i);
        }
    }
}