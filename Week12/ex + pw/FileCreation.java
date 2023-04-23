import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {

        java.io.File f = new java.io.File("text1.txt");
        f.createNewFile();
        System.out.println(f.exists());
        System.out.println(f.canWrite());
        FileWriter fw = new FileWriter(f);
        System.out.println(f.isFile()); // fw.(f.exists());
        fw.append("oldfile.txt", 2, 10);
        fw.append('a');
    }
}
