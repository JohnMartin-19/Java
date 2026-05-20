//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Animal{
    public void animalSound(){
        System.out.println("The animal makes sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says wee wee!");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog barks!!");
    }
}

public class Main {
    public static void main(String[] args) {
       Dog myDog = new Dog();
       myDog.animalSound();
        }
    }
}