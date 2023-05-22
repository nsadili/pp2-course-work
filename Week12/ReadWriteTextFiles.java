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

            FileReader fileReader = new FileReader("Week12/Files/" + fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            String fileContent1 = stringBuilder.toString();
            System.out.println("File content read using BufferedReader:");
            System.out.println(fileContent1);

            fileReader.close();
            bufferedReader.close();

            System.out.println("This is how many characters were read from file: " + fileContent1.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
