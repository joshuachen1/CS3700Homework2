public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);

            // This time, this reference refers to the thisReferenceExample instance
            // or whatever instance of the ThisReferenceExample calls this method.
            // Rather than an instance of Process had an Anonymous Inner Class been made here.
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.execute();
    }

    public String toString() {
        return "This is the main ThisReferenceExample class instance.";
    }
}
