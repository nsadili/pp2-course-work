package Week12.ex2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a file path:");
        File f = new File(sc.nextLine());
        System.out.println("Please specify the data to be written:");
        String data = sc.nextLine();
        sc.close();
        try {
            writeData(f, data);
            System.out.println(readDataByte(f));
            System.out.println(readDataBytes(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeData(File f, String data) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(f)) {
            fos.write(data.getBytes());
        }
    }

    public static String readDataByte(File f) throws IOException {
        StringBuilder sb = new StringBuilder();
        int b = 0;
        try (FileInputStream fis = new FileInputStream(f)) {
            while ((b = fis.read()) != -1) sb.append((char)b);
        }
        return sb.toString();
    }

    public static String readDataBytes(File f) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[1024];
        int n = 0;
        try (FileInputStream fis = new FileInputStream(f)) {
            while ((n = fis.read(bytes)) != -1) sb.append(new String(bytes, 0, n));
        }
        return sb.toString();
    }
}
