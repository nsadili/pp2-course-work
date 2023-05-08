import java.io.*;

public class Exercise_2 {

    public static void main(String[] args) {
        String inputFile = "FileInputStream.txt";
        String outputFile = "FileOutputStream.txt";

        try {
        
            FileInputStream fis = new FileInputStream(inputFile);
            byte[] bytes = new byte[(int) fis.available()];
            fis.read(bytes);
            fis.close();


            FileOutputStream fos = new FileOutputStream(outputFile);
            fos.write(bytes);
            fos.close();


            fis = new FileInputStream(outputFile);
            int content;
            String result = "";
            while ((content = fis.read()) != -1) {
                result += (char) content;
                System.out.print((char) content);
            }
            fis.close();
            System.out.println("\nContent of the file (using read() method): " + result);


            fis = new FileInputStream(outputFile);
            bytes = new byte[1024];
            int bytesRead = fis.read(bytes);
            result = new String(bytes, 0, bytesRead);
            fis.close();
            System.out.println("Content of the file (using read(byte[]) method): " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Answer on the question b_iii - "What's the difference between read() method and read(byte[] method)?":

In terms with read() method, it reads a single byte of data from the input stream and returns in the range of 0 to 255.
So, if there's no more data available in the input stream, -1 will be returned.
On the other hand read(byte[]) method reads a sequence of bytes from the input into specified byte array. So, this method
is more sufficient if there's big amount of data. 

 */