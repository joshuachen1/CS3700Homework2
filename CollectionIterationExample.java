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

        // Method 1: for loop (External Iterators)
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        // Method 2: for-each or for-in loop (External Iterator)
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
