//Anonymous in Java
//Its a class without a name and its used to override methods of an existing class or interface

class Animal{
    public void makeSound(){
        System.out.println("Animal makes sounds");
    }
}
public class Main {
    public static void main(String[] args) {
        //anon class
        Animal myAnimal = new Animal(){
            public void makeSound(){
                System.out.println("Woof qoof");
            }
        }; // end with semicolon.
        myAnimal.makeSound();
    }

}