package Packages;

import java.util.Scanner;

 ///polymorphism
 class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }

}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog barks");
    }
}
class Main{
   
    public static void main(String[] args) {
        Scanner myObject = new  Scanner(System.in);
        System.out.println("Enter username");

        String username = myObject.nextLine();
        System.out.println(username);

        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myAnimal = new Animal();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}

class Vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut Tuut!!");
    }
}

class Car extends  Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

