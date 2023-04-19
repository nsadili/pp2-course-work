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

        fileWrite(input,"\nI am happy , Gladious :):)");
        
        var res=fileRead(input);
        System.out.println(res);

    }

    static void fileWrite(File file, String text)  {

        try (FileWriter fw = new FileWriter(file,false)) {
                BufferedWriter bf = new BufferedWriter(fw);
                bf.write(text);
                bf.flush();
                bf.close();


        }catch(IOException e){
            e.printStackTrace();
        }


    }


    static String fileRead(File file){
        StringBuilder res = new StringBuilder();
            try (FileReader fw = new FileReader(file)) {
                int x=0;
                char[] arr =new char[8];
                int len;
                    while((len = fw.read(arr))!=-1){
                     
                        res.append(new String(arr,0,len));
                    }
                
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }

            return res.toString();

    }

}
