package rental;

public class Car extends Vehicle {
    public Car(String vehicleNumber, String model, double rentalRate) {
        super(vehicleNumber, model, rentalRate);
    }

    @Override
    public double calculateRental(int days) {
        // Car: base rate + 10% surcharge
        return super.calculateRental(days) * 1.10;
    }
}
