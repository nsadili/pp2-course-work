package Incomplete;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class RandomAccessFilesDemo {
    public static void main(String[] args) {
        String filename = "Resources/random/numbers.dat";

        try {
            // generateFileWithRandomIntegers("Resources/random/numbers.dat", 10, 10);

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
    }

    static void readFromFile(String filename, int offset, int count) throws IOException {
    }

    static void readKIntegersReversed(String filename, long k) throws IOException {
    }
}
