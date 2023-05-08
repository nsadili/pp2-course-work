import java.io.*;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("/Users/Ulvi/PP2/pp2-course-work/Week12/Resources/forCopy/random.txt");
        File destination = new File("/Users/Ulvi/PP2/pp2-course-work/Week12/Resources/forCopy/random.txt");

        start = System.currentTimeMillis();
        CopyFile(source, destination);

        

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }
    static void CopyFile(File src, File dst){
        try (var in = new FileInputStream(src);
               var out= new FileOutputStream(dst)) {

            byte[] buff= new byte[1024];
            int len;
            while((len= in.read(buff))>0)
               out.write(buff,0,len);

        } catch (IOException e) {
           
            e.printStackTrace();
        }

    }

}