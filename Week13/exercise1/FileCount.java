package week13.exercise1;

public class FileCount {

    static int globalCount = 0;

    static synchronized void increment() {
        globalCount++;
    }

    public int getCount() {
        return globalCount;
    }
}