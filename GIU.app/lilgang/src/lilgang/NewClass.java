/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lilgang;

/**
 *
 * @author hp
 */
public class NewClass {
    // Zoo class
public class Zoo {
    public static void main(String[] args) {
        // Create animal objects
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal monkey = new Monkey("Curious George", 3);

        // Demonstrate polymorphism using overloaded methods
        System.out.println("Lion:");
        lion.makeSound();
        lion.makeSound(2);
        lion.eat();
        lion.eat("meat");

        System.out.println("\nElephant:");
        elephant.makeSound();
        elephant.eat();
        elephant.eat("grass");

        System.out.println("\nMonkey:");
        monkey.makeSound();
        monkey.makeSound(3);
        monkey.eat();
        monkey.eat("bananas");
    }
}
}
