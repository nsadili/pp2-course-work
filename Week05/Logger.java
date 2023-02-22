package Week05;

public class Logger {
    private static Logger instance = null;
    private String log = "";
    
    private Logger() {}
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public void log(String message) {
        log += message + "\n";
    }
    
    public String getLog() {
        return log;
    }
}

