package Week12;

import java.io.*;

public class ReadWriteTextFiles {

    public static void main(String[] args) {
        String fileName = "input.txt";
        String content = "This content is written by FileWriter class";

        try {
            FileWriter fileWriter = new FileWriter("Week12/Files/" + fileName);
            fileWriter.write(content);
            fileWriter.close();
            //No need to file write anymore. Better to close it.

            FileReader readMethod = new FileReader("Week12/Files/" + fileName);
            FileReader readCharMethod = new FileReader("Week12/Files/" + fileName);

            StringBuilder stringBuilder = new StringBuilder();
            // I used string builder because it is not immutable and can be modified easily
            int data;
            while ((data = readMethod.read()) != -1) {
                char character = (char) data;
                stringBuilder.append(character);
            }
            String fileContent1 = stringBuilder.toString();
            System.out.println("File content read() method:");
            System.out.println(fileContent1);


            char[] readContent = new char[content.length()];
            stringBuilder = new StringBuilder();
            while (readCharMethod.read(readContent)!= -1) {
                stringBuilder.append(readContent);
            }
            String fileContent2 = stringBuilder.toString();
            System.out.println("File content read(char[]) method:");
            System.out.println(fileContent2);

            System.out.println("This is how many characters were read from file: " + fileContent2.length());
            readMethod.close();
            readCharMethod.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

