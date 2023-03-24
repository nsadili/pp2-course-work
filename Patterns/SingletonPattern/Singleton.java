package Patterns.SingletonPattern;

public class Singleton {
    private static Singleton instance;
    
    private Singleton() { } // private constructor
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // other methods and fields

}
