package Interfaces;

/*
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

To access the interface methods, the interface must be "implemented" (kinda like inherited) 
by another class with the implements keyword (instead of extends). The body of the interface 
method is provided by the "implement" class:

*/
interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements  Animal{
    public void animalSound(){
        System.out.println("Animal makes a sound");
    }
    public void sleep(){
        System.out.println("Zzzz");
    }
}
public class Main {
    public static void main(String[] args) {
        Pig nguruwe = new Pig();
        nguruwe.animalSound();
        nguruwe.sleep();
    }
}
