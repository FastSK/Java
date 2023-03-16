package OOP.Interface;

public interface Electronic {
    // constant variable
    String LED = "led";

    // Abstract method
    int getElectricityUse();

    // Static method
    static boolean isEnergyEfficient(String electronicType) {
        if (electronicType.equals(LED)) {
            return true;
        }
        return false;
    }

    //Default method
    default void printDescription() {
        System.out.println("Electronic Description");
    }
}

class Computer implements Electronic {
    @Override
    public int getElectricityUse() {
        return 1000;
    }
}