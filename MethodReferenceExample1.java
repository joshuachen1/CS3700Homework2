public class MethodReferenceExample1 {
    public static void main(String[] args) {

        // Method Reference (NameOfClassMethod :: methodName)
        // --------------------------------------------------
        // If there is a lambda expression that
        //      1. Takes in no input arguments
        //      2. Calls a method w/o any input arguments
        // Then you can replace the lambda expression with a method reference
        //
        Thread t = new Thread(MethodReferenceExample1::printMessage);   // equivalent to: () -> printMessage()
        t.start();
    }
    public static void printMessage() {
        System.out.println("Hello");
    }
}
