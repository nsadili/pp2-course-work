import java.io.*;
import java.util.Random;

public class RandomAccess {
    public static void main(String[] args) {
        String filename = "Resources/random/numbers.txt";

        try {
            readFile(filename);
            System.out.println();

            readFile(filename, 7, 5);
            System.out.println();

            readIntegers(filename, 10);
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void generateFileWithRandomIntegers(String filename, int length, int upperBound) throws IOException {
        Random rand = new Random(42);
        try (FileOutputStream out = new FileOutputStream(filename); DataOutputStream dos = new DataOutputStream(out)) {

            for (int i = 0; i < length; i++) {
                int r = rand.nextInt(upperBound + 1);
                System.out.println(r);
                dos.writeInt(r);
            }
        }
    }

    static void readFile(String filename) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            long count = file.length() / 4;
            while (count-- > 0) {
                System.out.println(file.readInt() + " ");
            }
            System.out.println("First is over");
        }
    }

    static void readFile(String filename, int start, int count) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            file.seek(start * 4);

            for (int i = 0; i < count; i++)
                try {
                    System.out.println(file.readInt() + " ");
                } catch (EOFException ex) {
                    break;
                }
        }
    }

    static void readIntegers(String filename, long k) throws IOException {
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