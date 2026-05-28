//an interface describes what a class can do w/ou specifying how
// (used for abstraction and multiple inheritance since a class is only restricted one inheritance)

//a functional interface only holds 1 abstract method
// ** Abstract methods DO NOT have a body **

@FunctionalInterface
public interface Greeting{
    String greet(String name); //only one abstract method
}