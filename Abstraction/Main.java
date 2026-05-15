package Abstraction;



// from this example, its NOT possible to create an object for the class Animal
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzz!!");
    }
}
public class Main {
   // Animal myAnimal = new Animal(); - This will raise an error
}
