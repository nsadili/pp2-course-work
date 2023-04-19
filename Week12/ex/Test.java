import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        boolean b = true;
        short s = 33;
        double d = -234.22;
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("types.txt"))) {
            dos.writeBoolean(b);
            dos.writeShort(s);
            dos.writeDouble(d);
        } catch (IOException ex) {
            System.out.println("Data write error: " + ex);
        }

    }
}
