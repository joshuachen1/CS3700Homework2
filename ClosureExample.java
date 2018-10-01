public class ClosureExample {
    public static void main(String[] args) {
        int a = 10;

        // This variable is "effectively" final
        int b = 20;

        // Whenever there is a lambda expression and it is using a variable in the scope
        // The Java Compiler freezes the value
        // So where the lambda expression goes, it has the frozen value of b
        // Process p in doProcess contains the frozen value of b
        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
