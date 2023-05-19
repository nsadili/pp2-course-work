package Week12.ex3;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify the file:");
        File f1 = new File(sc.nextLine());
        System.out.println("Please specify the path of the new file:");
        File f2 = new File(sc.nextLine());
        sc.close();
        
        try {
            if (!f2.exists()) {
                new File(f2.getParent()).mkdirs();
                f2.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2)) {
            byte[] bytes = new byte[8192];
            int n;
            while ((n = fis.read(bytes)) != -1) fos.write(bytes, 0, n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
