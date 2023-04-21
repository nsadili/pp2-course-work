import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextToFile {
    public static void main(String[] args) {
        File diary = new File("Week 12 - Incomplete/Resources/random/Diary.txt");
        write(diary, "Having a dream, bright as the sun, pure as the sky that will carry you to the stars<3.");
        System.out.println(read(diary));
    }

    static void write(File dest, String input) {
        try (FileWriter fw = new FileWriter(dest, true)) {
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(input);
            bf.append("\nBy Rahima\n");
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String read(File dest) {
        if (!dest.exists()) {
            return "null";
        }
        StringBuilder res = new StringBuilder();
        try (FileReader fr = new FileReader(dest);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString();
    }
    
}
