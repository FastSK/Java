package OOP.Polymorphism;

/**
 * Polymorphism
 * - It allows us to perform the same action in many different ways.
 * use the methods to perform a single action in different ways.
 * - An object to take different forms during runtime
 *
 */
public class Animal {
    private String name;
    private String color;

    public void eat() {
        System.out.println("Rice");
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public String getName() {
        return name;
    }
    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }
    public Animal setColor(String color) {
        this.color = color;
        return this;
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig");
    }

    public void eat() {
        System.out.println("piggy food");
    }
}

class dog extends Animal {
    private int breed;

    public void animalSound() {
        System.out.println("bow");
    }

    public void eat() {
        System.out.println("chicken good");
    }

    public void eat(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("chicken good");
        }
    }

    public int getBreed() {
        return breed;
    }

    public dog setBreed(int breed) {
        this.breed = breed;
        return this;
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // create a Animal object
        Animal myPig = new Pig();
        Animal myDog = new dog();

        myAnimal.animalSound();
        myAnimal.eat();

        myDog.animalSound();
        myDog.eat(); // override the parent .eat method

        myPig.animalSound();
        myPig.eat();
    }
}