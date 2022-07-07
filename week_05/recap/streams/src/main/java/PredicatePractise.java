import java.util.Arrays;
import java.util.Locale;
import java.util.function.Predicate;

public class PredicatePractise {
    public static void main(String[] args) {
        //Predicate review
        //A predicate is a type of functional interface
        //A functional interface is one that has a single abstract method
        //Your lambda, or arrow function represents the unimplemented (abstract) method in the functional interface

        Arrays.asList("A", "list", "of", "words", "I", "am", "making", "up").stream().filter((str) ->{
            return str.toLowerCase().contains("a") && !str.toLowerCase().contains("k");
        }).forEach(System.out::println);

    }
}
