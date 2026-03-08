class Flight {
    void fly() {
        System.out.println("Flight is in the air.");
    }
}

class PassengerFlight extends Flight {
    @Override
    void fly() {
        System.out.println("Passenger flight is cruising with 200 passengers.");
    }
}

class CargoFlight extends Flight {
    @Override
    void fly() {
        System.out.println("Cargo flight is transporting heavy freight across the ocean.");
    }
}

public class FlightTest {
    public static void main(String[] args) {
        Flight f1 = new PassengerFlight();
        Flight f2 = new CargoFlight();
        
        f1.fly(); // Outputs passenger behavior
        f2.fly(); // Outputs cargo behavior
    }
}