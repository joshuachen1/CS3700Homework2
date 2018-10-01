import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // How to Iterate through the List
        // External Iterator - We have control the iteration

        // Method 1: for loop (External Iterators)
        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        // Method 2: for-each or for-in loop (External Iterator)
        System.out.println("Using for in loop");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("Using lambda for-each loop");
        // forEach accepts a Consumer (a Functional Interface) to be used for lambda
        // also p -> method(p) can be replaced with a Method Reference
        // Since forEach loops does not care about the order at which it is iterated as long as each element is accessed
        // then forEach loops are able to run in Parallel
        people.forEach(System.out::println);
    }
}
