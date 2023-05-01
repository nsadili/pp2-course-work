package Week12.bonus;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessFilesDemo {
    public static void main(String[] args) {
        String filename = "Week12/bonus/random_access_files_demo.dat";

        try {
            readFromFile(filename);
            System.out.println();

            readFromFile(filename, 7, 5);
            System.out.println();

            readKIntegersReversed(filename, 10);
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void generateFileWithRandomIntegers(String filename, int length, int upperBound) throws IOException {
        Random rand = new Random(42);
        try (FileOutputStream fos = new FileOutputStream(filename); DataOutputStream dos = new DataOutputStream(fos)) {

            for (int i = 0; i < length; i++) {
                int r = rand.nextInt(upperBound + 1);
                System.out.println(r);
                dos.writeInt(r);
            }
        }
    }

    static void readFromFile(String filename) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            long count = file.length() / 4;
            while (count-- > 0) {
                System.out.println(file.readInt() + " ");
            }
            System.out.println("First is finished");
        }
    }

    static void readFromFile(String filename, int offset, int count) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            file.seek(offset * 4);

            for (int i = 0; i < count; i++)
                try {
                    System.out.println(file.readInt() + " ");
                } catch (EOFException ex) {
                    break;
                }
        }
    }

    static void readKIntegersReversed(String filename, long k) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            long count = file.length() / 4;
            if (count < k) {
                k = count;
            }
            for (int i = 0; i < k; i++) {
                file.seek((count - i - 1) * 4);
                System.out.println(file.readInt() + " ");
            }
        }
    }
}
