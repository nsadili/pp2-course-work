package Week12;

import java.io.*;
import java.util.Scanner;

public class StreamsDemo{
    
    Scanner sc= new Scanner(System.in);
    String a= sc.nextLine();
    byte []b= a.getBytes();
    FileOutputStream fos= null;
     try {
        fos= new FileOutputStream("file1.txt");
        fos.write(b);
     } catch (Exception e) {
        System.out.println("File input error: " +e);
     }
     finally{
        try {
            fos.close();
        } catch (Exception e1) {
            System.out.println("Problem in closing: "+e1);
        }
     }
     
     byte []c= new byte[8];
     FileInputStream fis= new FileInputStream("file1.txt");
     //while(fis.read()!=-1)
       
     fis.read();
     fis.read(c);
    
}