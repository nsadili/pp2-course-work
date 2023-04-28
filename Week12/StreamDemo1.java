package Week12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo1 {
    public static void main(String[] args) {
        String fileName = "ex2/data.dat";
        String data = "Programming Principles II with JavA";

         writeData(fileName, data);
         readData(fileName);

    }

    static void writeData(String path, String data) {
        byte[] a= data.getBytes();

       try( FileOutputStream fos= new FileOutputStream(path)) {

        fos.write(a);
       }
        catch (IOException e){
            e.printStackTrace();
        }
       
    }

    static void readData(String path) {
       try(FileInputStream fis= new FileInputStream(path)) {
        int ch;
        while((ch= (char) fis.read())!=-1)
        System.out.println(ch);
       } catch (IOException e) {
         e.getStackTrace();
       }
    }

    static String readData2(String path){
        String res="";
        StringBuilder sb= new StringBuilder();
        try(FileInputStream fis= new FileInputStream(path)) {
            byte []b= new byte[8];
            int len;

            
            while((len=fis.read(b))>0){
               // res+=new String(b, 0, len);
                sb.append(new String a, 0, len);
            }

           } catch (IOException e) {
             e.getStackTrace();
           }

         //  return res;
         return sb;
    }
}
