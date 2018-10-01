import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 2;

        // The lambda expression (v, k) -> System.out.println(v + k)
        // Overrides the accept method as one that accepts 2 integers
        // and prints the sum.
        process(someNumbers, key, (v, k) -> System.out.println(v + k));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i :
                someNumbers) {
            consumer.accept(i, key);
        }
    }
}
