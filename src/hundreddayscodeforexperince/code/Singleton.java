package hundreddayscodeforexperince.code;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = getInstance(); // Get the single instance
        System.out.println("Singleton instance: " + singleton);
    }
}
