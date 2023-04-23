import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Duplicate {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hello1.txt");
        fis.read();
        FileOutputStream fos = new FileOutputStream("hello1.txt", true);
        byte[] b = {
                2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 34,
        };
        fos.write(b, 4, 4);

        OutputStream os = new FileOutputStream("hello1.txt", true);
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeDouble(2.77);

        OutputStream os1 = new FileOutputStream("hello1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        Student std = new Student();
        std.setFirstName("Sevinj");
        std.setLastName("Jafarli");
        std.setGpa(4.0);
        oos.writeObject(std);


        try (FileWriter fw = new FileWriter("oldfile.txt",true)) {
            fw.write("Hello world and pp2");
        }
    }
}
