package Week12.ex7;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify a path:");
        String path = sc.nextLine();
        File f = new File(path);
        if (!f.exists() || f.isFile()) System.out.println(getFileInfo(f));
        else
            for (File child : f.listFiles())
                System.out.println(getFileInfo(child) + "\n");
        sc.close();
    }

    public static String getFileInfo(File f) {
        StringBuilder sb = new StringBuilder();
        sb.append("Absolute path: " + f.getAbsolutePath() + "\n");
        sb.append("Exists: " + (f.exists() ? "YES" : "NO") + "\n");
        if (f.exists()) {
            sb.append("Type: " + (f.isFile() ? "FILE" : "DIRECTORY") + "\n");
            if (f.isFile()) sb.append("Length: " + f.length() + "\n");
            sb.append("Hidden? " + (f.isHidden() ? "YES" : "NO") + "\n");
            sb.append("Can execute? " + (f.canExecute() ? "YES" : "NO") + "\n");
            sb.append("Can read? " + (f.canRead() ? "YES" : "NO") + "\n");
            sb.append("Can write? " + (f.canWrite() ? "YES" : "NO") + "\n");
            sb.append("Last modified: " + new Date(f.lastModified()));
        }
        return sb.toString();
    }
}
