import java.io.IOError;
import java.io.IOException;

public class test{
    


    public static void main(String[] args)   {

        System.out.println("Enter character");
        int ch=0;



        try{
              ch = System.in.read();
        }catch(IOException ex){
            ex.printStackTrace();
        }

        //ch=System.in.read();

        System.out.println("You enter: " + (char) ch + " number " + ch );


       

        
        
        
    }
}