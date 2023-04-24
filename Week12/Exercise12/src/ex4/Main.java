package ex4;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String input1 = "";
        String input2 = "";

        try {
            FileWriter fw = new FileWriter("./Exercise12/src/ex4/testfile.txt");
            fw.write("Test input.");
            fw.close();

            FileReader fr1 = new FileReader("./Exercise12/src/ex4/testfile.txt");
            int ch;
            while ((ch = fr1.read()) != -1) {
                input1 += (char)ch;
            }
            fr1.close();

            int length;
            char[] chArray = new char[4];
            FileReader fr2 = new FileReader("./Exercise12/src/ex4/testfile.txt");
            while ((length = fr2.read(chArray)) != -1) {
                input2 += new String(chArray, 0, length);
            }
            fr2.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        System.out.println(input1);
        System.out.println(input2);
    }
}