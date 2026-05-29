package package_demo;

// Main.java thuộc package package_demo
//import animals.Animal;
import package_demo.animals.Cat;
import package_demo.pets.Dog;
import package_demo.other.Stranger;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Cat (cùng package với Animal) ===");
        Cat cat = new Cat("Kitty");
        cat.demo();

        System.out.println("\n=== Dog (khác package, nhưng là subclass) ===");
        Dog dog = new Dog("Buddy");
        dog.demo();

        System.out.println("\n=== Stranger (khác package, không kế thừa) ===");
        Stranger stranger = new Stranger();
        stranger.demo();
    }
}
