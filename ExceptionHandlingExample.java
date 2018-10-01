import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        // Externalize try-catch by wrapping a lambda within a lambda
        // (v, k) -> System.out.println(v / k) is in wrapperLambda()
        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

        // Currently, wrapperLambda accepts the lambda expression (v, k) -> System.out.println(v / k)
        // However, replaces the lambda expression with its own: (a, b) -> System.out.println(a + b)
        // Therefore, the lambda expression accepted by process is: (a, b) -> System.out.println(a + b)

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i :
                someNumbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> System.out.println(a + b);
    }
}
