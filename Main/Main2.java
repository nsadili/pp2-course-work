package Main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("Text.txt", false);
        f.write("SALAM DOSTLAR\n");
        f.close();
        File f2 = new File("Text.txt");

        FileOutputStream fop = new FileOutputStream(f2);

        String s = "SALAMM";
        byte [] data = s.getBytes();
        fop.write(data);
        fop.close();     
        

    }
}
