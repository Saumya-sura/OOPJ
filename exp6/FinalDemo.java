// Part A: Final method in superclass
class Animal {
    public final void display() {
        System.out.println("This is Animal");
    }
}
/*
class Dog extends Animal {
    // This will cause a compile-time error because display() in Animal is final
     
    public void display() {
        System.out.println("This is Dog");
    }
}*/

// Part B: Final class
final class AnimalFinal {
    public void display() {
        System.out.println("This is AnimalFinal");
    }
}

// Uncommenting below will cause compile-time error
// class DogFinal extends AnimalFinal {
//     public void display() {
//         System.out.println("This is DogFinal");
//     }
// }

public class FinalDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.display();
        AnimalFinal af = new AnimalFinal();
        af.display();
    }
}
