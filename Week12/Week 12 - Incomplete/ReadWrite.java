import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        File a = new File("Resources/write.txt");
        // Scanner sc = new Scanner(System.in);
        // // String data = sc.next();
        write(a, "Karabagh is Azerbaijan!!!");
        System.out.println(read(a));

    }
    static void write(File f, String a) {
        try (FileWriter fw = new FileWriter(f, false)) {
            fw.write(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static String read(File file) {
        StringBuilder res = new StringBuilder();
        try (FileReader fw = new FileReader(file)) {
            BufferedReader bf = new BufferedReader(fw);
            char[] array = new char[16];
            int len;
            while ((len = bf.read(array)) != -1) {
                res.append(array, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString();
    }
}
