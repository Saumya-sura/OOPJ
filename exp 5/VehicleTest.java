// Vehicle.java
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void drive_car() {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    void drive_bike() {
        System.out.println("Driving a bike");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.drive();
        car.drive_car();
        bike.drive();
        bike.drive_bike();
    }
}
