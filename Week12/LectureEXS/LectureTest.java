package Week12.LectureEXS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class LectureTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream os = new FileOutputStream("myfile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        // Student std = new Student();
        Student std= new Student();
        std.setFirstName("Sevinj");
        std.setLastName("Jafarli");
        std.setGpa(4.0);
        oos.writeObject(std);
    }
}
