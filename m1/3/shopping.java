//  An online shopping system needs to calculate the total bill. 
// The program should: 
// a. Initialize product details using constructors 
// b. Calculate bill amount using methods 
// c. Apply discount using method overloading 
class shopping{
    String product;
    double price;
    int quantity;
    shopping(String p, double pr, int q){
        product = p;
        price = pr;
        quantity = q;
    }
    double cal(){
        return price * quantity;
    }
    double cal(double discount){
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public static void main (String [] args){
        shopping s1 = new shopping("Laptop", 50000, 1);
        System.out.println("Total Bill: " + s1.cal());
        System.out.println("Total Bill after discount: " + s1.cal(10));
    }
}