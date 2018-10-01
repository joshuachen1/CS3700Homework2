import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Printing all persons");

        // The Instance Method, p -> System.out.println(p), can be replaced with a Method Reference
        performConditionally(people, p -> true, p -> System.out.println(p));

        performConditionally(people, p -> true, System.out::println); // equivalent to: p -> method(p)

    }

    // There are built in Function Interfaces for Out-of-the-Box Interfaces
    // The Predicate Interface contains the method test that accepts a generic object and returns a boolean
    // Use the Predicate Interface rather than create an Interface
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p :
                people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}