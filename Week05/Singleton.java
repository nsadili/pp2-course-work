public class Singleton {
    
    private static Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;   
    }

    public static Singleton getInstance(String data) {
        if (instance == null) {
        instance = new Singleton(data);
        }
        return instance;
    }

}

// the code in incoplite yet because it is under the risk of creating
// several instances if two or more threads access the code simultaneously