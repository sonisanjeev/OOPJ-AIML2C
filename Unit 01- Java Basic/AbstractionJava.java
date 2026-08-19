abstract class Vehicle {

    // Abstract method
    abstract void start();
    // Normal method
    void stop() {
        System.out.println("Vehicle stopped");
    }
    // Final method
    final void engine() {
        System.out.println("Engine is running");
    }
    // Static method
    static void breakdown() {
        System.out.println("Engine is breakdown");
    }
}
class Car extends Vehicle {

    // Implementing abstract method
    @Override
    void start() {
        System.out.println("Vehicle Starting");
    }

    // ❌ Cannot override final method
    // void engine() {
    //     System.out.println("New Engine");
    // }
}

public class AbstractionJava {

    public static void main(String[] args) {

        // Abstract class reference, child class object
        Car obj = new Car();

        obj.start();       // Abstract method implementation
        obj.stop();        // Normal method
        obj.engine();     // Final method

        // Calling static method using class name
        Vehicle.breakdown();
    }
}