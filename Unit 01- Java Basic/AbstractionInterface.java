interface Vehicle {
    // Abstract method to hide the implementiaon
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle stopped");
    }

    // Static method
    static void breakdown() {
        System.out.println("Static method of Vehicle interface");
    }
}
class Car implements Vehicle {

    // Implementing interface method
    @Override
    public void start() {
        System.out.println("Car starts");
    }
}

public class AbstractionInterface {

    public static void main(String[] args) {

        // Interface reference, Car object
        Car obj = new Car();

        obj.start();
        obj.stop();

        // Calling static method using interface name
        Vehicle.breakdown();
    }
}