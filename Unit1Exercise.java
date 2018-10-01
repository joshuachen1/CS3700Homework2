import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        // Comparator only has one method
        // Therefore, Comparator is a Functional Interface and can be used as a Lambda Type
        // Since sort already knows that it will accept two objects,
        // Type Inferencing allows us to omit Person
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        // The Lambda Expression is one that is an instance of Condition
        // and overrides the test method as one that returns a boolean value
        // and always returns true
        printConditionally(people, p -> true);

        // Step 3: Create a method that prints all people that have last name beginning with 'C'
        // The Lambda Expression is one that is an instance of Condition
        // and overrides the test method as one that returns a boolean value
        // and returns p.getLastName().startsWith("C")
        printConditionally(people, p -> p.getLastName().startsWith("C"));

    }

    // Now the instance of Condition allows us to determine a set condition
    // making the method more generic rather than too specific.
    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p :
                people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }
}

interface Condition {
    boolean test(Person p);
}
