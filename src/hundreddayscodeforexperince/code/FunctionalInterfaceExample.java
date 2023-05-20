package hundreddayscodeforexperince.code;

// Defining a custom functional interface
@FunctionalInterface
interface MyFunctionalInterface {
    void performAction(String message);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Example of using the custom functional interface
        MyFunctionalInterface myFunction = message -> System.out.println("Performing action: " + message);
        myFunction.performAction("Hello, World!");
    }
}
