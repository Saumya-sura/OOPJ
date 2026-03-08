package exp4.customer;
import java.util.Scanner;

import exp4.rental.*;

public class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void rentVehicle(Vehicle v, int days) {
        double amount = 0;
        if (v instanceof Car) {
            amount = ((Car)v).calculateRental(days);
            System.out.println("Car rented: " + v.getModel());
        } else if (v instanceof Bike) {
            amount = ((Bike)v).calculateRental(days);
            System.out.println("Bike rented: " + v.getModel());
        } else {
            amount = v.getRentalRate() * days;
            System.out.println("Vehicle rented: " + v.getModel());
        }
        System.out.println("Rental amount for " + days + " days: Rs. " + amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter customer ID: ");
        String id = sc.nextLine();
        Customer c = new Customer(name, id);
        System.out.println("Choose vehicle type (1. Car 2. Bike): ");
        int type = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter vehicle number: ");
        String vno = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter rental rate per day: ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        Vehicle v;
        if (type == 1) v = new Car(vno, model, rate);
        else v = new Bike(vno, model, rate);
        c.rentVehicle(v, days);
        sc.close();
    }
}
