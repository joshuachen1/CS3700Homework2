public class ClosureExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Since doProcess method is called
        // The doProcess method calls the implementation of process in the main method
        // Meaning there is NO variable b within the scope of doProcess
        // but exists since the Java RunTime keeps track of the value of b

        doProcess(a, new Process() {

            @Override
            public void process(int i) {
                System.out.println(i + b);
            }
        });
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
