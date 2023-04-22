import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
    public static void main(String[] args) {
        try{
            FileWriter w= new FileWriter("Week12/Resources/DirA/file1.txt");
            w.write("Welcome to the Programming Principles 2 course!");
            w.close();
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            FileReader r= new FileReader("Week12/Resources/DirA/file1.txt");
            int c;
            while((c=r.read())!= -1){
                System.out.print((char)c);
            }
            System.out.println();
            r.close();
            System.out.println("Succesfully read file!");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
