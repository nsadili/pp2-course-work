package Week12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "Week12/input.txt";
        File file = new File(url);
        try {
            FileInputStream f = new FileInputStream(file);
            FileOutputStream m = new FileOutputStream(file, false);

            int eof = 0;

            // Rest of your code here...

            f.close();
            m.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
