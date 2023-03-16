package OOP;

// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep();
}
//interface methods must be "implemented" w implements keyword
class Pig implements Animal {
    //    @Override
    public void animalSound() {
        // body of animalSound
        System.out.println("pig, pig");
    }

    //    @Override
    public void sleep() {
        System.out.println("zzz");
    }
}

class MainInterface{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}