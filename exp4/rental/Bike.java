package exp4.rental;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber, String model, double rentalRate) {
        super(vehicleNumber, model, rentalRate);
    }

    @Override
    public double calculateRental(int days) {
        // Bike: base rate - 5% discount
        return super.calculateRental(days) * 0.95;
    }
}
