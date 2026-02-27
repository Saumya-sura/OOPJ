import java.util.Scanner;

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void showProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price:" + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod;

    Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void showWarrantyDetails() {
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

class Laptop extends Electronics {
    int batteryBackup;

    Laptop(String productName, double price, int warrantyPeriod, int batteryBackup) {
        super(productName, price, warrantyPeriod);
        this.batteryBackup = batteryBackup;
    }

    void displayLaptopSpecifications() {
        System.out.println("Battery Backup: " + batteryBackup + " hours");
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Warranty Period (years): ");
        int warranty = sc.nextInt();

        System.out.print("Enter Battery Backup (hours): ");
        int battery = sc.nextInt();

        System.out.println("\n--- Laptop Details ---");

        Laptop laptop = new Laptop(name, price, warranty, battery);

        laptop.showProductDetails();
        laptop.showWarrantyDetails();
        laptop.displayLaptopSpecifications();

        sc.close();
    }
}