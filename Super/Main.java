package Super;

class Animal{
    String type = "Animal";
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal{
    String type = "Mutina";
    public void animalSound(){
        super.animalSound();
        System.out.println("The dog barks");
    }
    public void printType(){
        System.out.println(super.type);
    }
} 

public class Main {
    public static void main(String[] args) {
        Dog myMutina = new Dog();
        myMutina.animalSound();
        //myMutina.type;
        myMutina.printType();
    }
}
