public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        thisReferenceExample.doProcess(10, new Process() {

            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);

                // "this" refers to the new instance of Process on line 10
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class";
            }
        });
    }
}
