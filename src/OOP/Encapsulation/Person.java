package OOP.Encapsulation;

public class Person {
    private String name; // private = restricted access

    // getter
    public String getName() {
        return name;
    }

    // setter : takes parameter and assigns it to the name variable
    // this keyword is used to refer to the current object
    public void setName(String newName) {
        this.name = newName;
    }
}
