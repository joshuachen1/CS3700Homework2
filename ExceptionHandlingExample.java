import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        // Works but at the cost of readability
        process(someNumbers, key, (v, k) -> {
            try {
                System.out.println(v / k);
            }
            catch (ArithmeticException e) {
                System.out.println("An Arithmetic exception happened.");
            }
        });
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i :
                someNumbers) {
            consumer.accept(i, key);
        }
    }
}
