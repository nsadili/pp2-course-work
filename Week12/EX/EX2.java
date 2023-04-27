package EX;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX2 {
    public static void main(String[] args) {
        String strData = "This is the first line. \nThis is the second line.\nThis is the third line.\n";

        
        // try { 
        //     FileOutputStream fos = new FileOutputStream("strFile.txt");
        //     fos.write(strData.getBytes());
            
        // }
        // catch (IOException e){
        //     System.out.println(e);
        // }
            
        // finally {
        //     try {
        //         fos.close();
        //     }
        //     catch (IOException e){
        //         e.printStackTrace();
        //     }

        // }

        StringBuilder str = new StringBuilder();

        try (FileInputStream fis = new FileInputStream("strFile.txt")) { 
            int c ;
            
            while ((c = fis.read()) != -1){
                str.append((char) c);
                
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(str.toString());

        
    
    
}
}
