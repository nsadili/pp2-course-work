import java.io.OutputStream;
import java.io.*;

public class Test3 implements Serializable{
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("hello.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(os);
    }
}
