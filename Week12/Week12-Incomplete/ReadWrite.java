import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {
        try (FileWriter fw1 = new FileWriter("Resources/DirA/file1.txt")) {
            fw1.write("This is file 1 text.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr1=new FileReader("Resources/DirA/file1.txt");
        FileWriter fw2 = new FileWriter("Resources/DirA/DirB/DirC/file5.txt")) {
            int b;
            while ((b =fr1.read())!=-1){
                fw2.write((char)b);
            }
            fw2.write("\nit is copied from the file1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr2=new FileReader("Resources/DirA/DirB/DirC/file5.txt");
        FileWriter fw3 = new FileWriter("Resources/DirA/DirB/file10.txt");
        FileWriter fw4 = new FileWriter("Resources/DirA/Dirb/DirD/file3.txt")) {
            char[] bytes = new char[8];
            int len;
            while ((len=fr2.read(bytes))!=-1){
                // fw3.write(bytes, 1, len-2);
                fw3.write(bytes, 0, len);
                fw4.write(bytes, 0, len);
            }
            fw3.write("\nit is copied from the file5.txt");
            fw4.write("\nit is copied from the file5.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }
}
