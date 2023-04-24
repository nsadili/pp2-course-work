import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) {
        String fileName = "Resources/ex1/data1.dat";
        String data = "Programming Principles II with JavA";
        writeData(fileName, data);
        checkFileContent(fileName);
        String content1 = readDataUsingReadMethod(fileName);
        String content2 = readDataUsingReadByteArrayMethod(fileName);
        System.out.println("Content using read() method: " + content1);
        System.out.println("Content using read(byte[]) method: " + content2);
    }
    
    static void writeData(String path, String data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("Data has been written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing data to file: " + e.getMessage());
        }
    }
    
    static void checkFileContent(String path) {
        File file = new File(path);
        System.out.println("File size: " + file.length() + " bytes.");
    }
    
    static String readDataUsingReadMethod(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int content;
            StringBuilder sb = new StringBuilder();
            while ((content = fis.read()) != -1) {
                sb.append((char) content);
            }
            fis.close();
            return sb.toString();
        } catch (IOException e) {
            System.out.println("An error occurred while reading data from file: " + e.getMessage());
            return null;
        }
    }
    
    static String readDataUsingReadByteArrayMethod(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            byte[] bytes = new byte[(int) new File(path).length()];
            fis.read(bytes);
            fis.close();
            return new String(bytes);
        } catch (IOException e) {
            System.out.println("An error occurred while reading data from file: " + e.getMessage());
            return null;
        }
    }
    
}
