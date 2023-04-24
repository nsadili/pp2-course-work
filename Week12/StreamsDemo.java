package Week12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Week12/Resources/ex1/data1.txt";
        String data = "PP II with JavA";

        writeData(fileName, data);
        //eadData(fileName);
        System.out.println(readData(fileName));

    }

    static void writeData(String path, String data) {
       
    try(FileOutputStream fos = new FileOutputStream(path)){
        fos.write(data.getBytes());
        fos.close();
          
       }catch(IOException e){
            e.printStackTrace();
        }
    }

    static String readData(String path) {

        StringBuilder sb= new StringBuilder();
        try (var fis = new FileInputStream(path)) {
        

            byte[] buf= new byte[8];
            int len;
            
            while((len=fis.read(buf)) > 0)
            sb.append(new String(buf,0,len));




        } catch (IOException e) {
          
            e.printStackTrace();
        }
        return sb.toString();

        
    }
}