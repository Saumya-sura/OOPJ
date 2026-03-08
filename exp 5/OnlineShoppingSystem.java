// OnlineShoppingSystem.java
class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void showProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod; // in months

    Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void showWarrantyDetails() {
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Laptop extends Electronics {
    int batteryBackup; // in hours

    Laptop(String productName, double price, int warrantyPeriod, int batteryBackup) {
        super(productName, price, warrantyPeriod);
        this.batteryBackup = batteryBackup;
    }

    void displayLaptopSpecifications() {
        showProductDetails();
        showWarrantyDetails();
        System.out.println("Battery Backup: " + batteryBackup + " hours");
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell Inspiron 15", 55000, 24, 8);
        System.out.println("--- Laptop Specifications ---");
        laptop.displayLaptopSpecifications();
    }
}
