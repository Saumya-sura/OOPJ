package lab1;

public class LargestOfTwo {
    public static void main(String[] args) {
        int num1 = 15, num2 = 25;
        int largest = (num1 > num2) ? num1 : num2;
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Largest: " + largest);
    }
}
