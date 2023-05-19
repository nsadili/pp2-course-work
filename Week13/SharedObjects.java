import java.io.Reader;

import org.w3c.dom.css.Counter;

public class SharedObjects {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int N = 100; // Number of increments and reads

        Incrementor incrementor = new Incrementor();
        Reader reader = new Reader(counter, N);

        incrementor.start();
        ((Object) reader).start();

        try {
            incrementor.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

