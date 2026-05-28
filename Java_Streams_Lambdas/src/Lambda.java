//Lambdas are a shorter way of writing functional interfaces,without creating a whole class
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda{
    Comparator<String> comp = new Comparator<String>() {
        //before lambdas
        @Override
        public int compare(String a, String b){
            return a.compareTo(b);
        }

        // with lambdas
        Comparator<String> comp = (c,d) -> c.compareTo(d);
        System.out.println(comp);
        //w/out params
        () -> System.out.println("Hello");

        //1 param
        name  -> System.out.println("Hello" + name);

        //multiple params
        (e,f) -> e * f;

        //multi lines with curly braces

        (g,h) -> {
            var result = g * h;
            return result;
        }

        //using built in Functional Interfaces
        //predicate( tests a condition )
        Predicate<Integer> isAdult =  age -> age >= 18;
        System.out.println(isAdult.test(20));
        System.out.println(isAdult.test(15));

        //function(transform input)
        Function<String, Integer> getLength = str -> str.length();
        System.out.println(getLength.apply("John"));

        //consumer - does something, returns nothing
        Consumer<String> printer = name -> System.out.println("Woza woza" + name);
        printer.accept("Mburu");

        //supplier - produces sometings/a result

        Supplier<String> gretting = () -> "Good Morning";
        System.out.println(greeting.get());

    }
}

