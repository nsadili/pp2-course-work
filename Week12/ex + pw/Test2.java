import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
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

        try (DataInputStream dis = new DataInputStream(new FileInputStream("types.txt"));
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("types.txt"))) {
            boolean b1 = ((DataInput) dos).readBoolean();
            System.out.println("Boolean is: " + b1);
            short s1 = ((DataInput) dos).readShort();
            System.out.println("Short is: " + s1);
            double d1 = ((DataInput) dos).readDouble();
            System.out.println("Double is: " + d1);
        } catch (IOException ex) {
            System.out.println("Data read error: " + ex);
        }

    }
}
