package OOP.Interface;

interface Transform {
    void transform();
}

interface Fly {
    void fly();
}

class Car implements Fly, Transform {

    @Override
    public void fly() {
        System.out.println("I can Fly!!");
    }

    @Override
    public void transform() {
        System.out.println("I can Transform!!");
    }
}