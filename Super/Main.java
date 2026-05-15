package Super;

class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal{
    public void animalSound(){
        super.animalSound();
        System.out.println("The dog barks");
    }
} 

public class Main {
    public static void main(String[] args) {
        Dog myMutina = new Dog();
        myMutina.animalSound();
    }
}
