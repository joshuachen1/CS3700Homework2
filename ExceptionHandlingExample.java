import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;


        process(someNumbers, key, (v, k) -> System.out.println(v / k));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i :
                someNumbers) {
            try {
                consumer.accept(i, key);
            }
            catch(ArithmeticException e) {
                // Inefficient since you do not know of all the inputs that are passed through
                // and would need to create more and more catch blocks 
            }
        }
    }
}
