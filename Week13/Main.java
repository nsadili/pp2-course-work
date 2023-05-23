package Week13;

public class Main {
   public static void main (String args[]) {

    int coreCount = Runtime.getRuntime().availableProcessors();
    System.out.println(coreCount);
    int cnt = 0;

    long starts = System.currentTimeMillis();
    for (int i=0; i<coreCount; i++) {
        for (int j=0; j<250000; j++) {
            cnt++;
        }
    }
    long finishes = System.currentTimeMillis();
    System.out.println(finishes - starts);

}}

