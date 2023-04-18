import java.io.File;

public class DuplicateFiles {
    public static void main(String[] args) {

        long start, end;

        File source = new File("Resources\\forCopy\\dump.txt");
        File dest = new File("Resources\\forCopy\\copy-dump.txt");

        start = System.currentTimeMillis();

        // TODO

        end = System.currentTimeMillis();
        System.out.println("Total duration: " + (end - start));
    }

}