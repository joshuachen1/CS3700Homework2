import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Stream
        // Filter if the last name starts with C
        // if true, then that element moves to the forEach

        // Think of it as an assembly line
        // Each element gets filtered
        // then moves to the forEach if valid
        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        // Streams have 3 parts
        // 1. Source (contains the elements on that stream)
        // 2. Operations performed on stream
        // 3. Terminal Operation (causes stream to act)


        long count = people.stream()                                         // source:     people list
                        .filter(p -> p.getLastName().startsWith("C"))       // operation:   filter the last names starting with "C"
                        .count();                                           // terminal:    the count

        System.out.println(count);
    }
}
