package Week12.ex4;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a file path:");
        File f = new File(sc.nextLine());
        System.out.println("Please specify the text to be written:");
        String data = sc.nextLine();
        sc.close();
        try {
            writeText(f, data);
            System.out.println(readByChar(f));
            System.out.println(readChars(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeText(File f, String data) throws IOException {
        try (FileWriter fw = new FileWriter(f)) {
            fw.write(data);
        }
    }

    public static String readByChar(File f) throws IOException {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        try (FileReader fr = new FileReader(f)) {
            while ((c = fr.read()) != -1) sb.append((char)c);
        }
        return sb.toString();
    }

    public static String readChars(File f) throws IOException {
        StringBuilder sb = new StringBuilder();
        char[] buf = new char[8192];
        int n = 0;
        try (FileReader fr = new FileReader(f)) {
            while ((n = fr.read(buf)) != -1) sb.append(buf, 0, n);
        }
        return sb.toString();
    }
}
