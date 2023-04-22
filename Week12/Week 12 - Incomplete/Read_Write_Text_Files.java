import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_Write_Text_Files {

    public static void main(String[] args) {

        File input = new File("input.txt");
        // fileWrite(input,"Hello! My name is Shamil Abbasov");
        // fileWrite(input,"\nToday, I got my driving license.");

        fileWrite(input, "I am happy , Gladious :):)");

        var res = fileRead(input);
        System.out.println(res);

    }

    static void fileWrite(File file, String text) {

        try (FileWriter fw = new FileWriter(file, false)) {

            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(text);
            bf.flush();
            bf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String fileRead(File file) {
        StringBuilder res = new StringBuilder();
        try (FileReader fw = new FileReader(file)) {

            BufferedReader bf = new BufferedReader(fw);
            char[] arr = new char[16];
            // bf.read(arr);

            int len;
            while ((len = bf.read(arr)) != -1) {

                // res.append(new String (arr,0,len));
                res.append(arr, 0, len);

            }
            // var x=0;
            // while((x=bf.read())!=-1){
            // res.append((char)x);
            // }

            bf.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return res.toString();

    }

}
