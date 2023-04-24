import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
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

            readKIntegersReversed(filename, 3);
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

        try (RandomAccessFile ran = new RandomAccessFile(filename, "r")) {
            int readed = 0;
            while (true) {

                readed = ran.readInt();
                System.out.print(readed + " ");
            }

        } catch (EOFException e) {
            System.out.println("\nEnd of file! 1.st method");
        }

    }

    static void readFromFile(String filename, int offset, int count) throws IOException {
        try (RandomAccessFile ran = new RandomAccessFile(filename, "r")) {

            ran.seek(offset * 4);

            int readed;
            var i = 0;

            while (i < count) {
                readed = ran.readInt();
                System.out.print(readed + " ");
                i++;

            }

        } catch (IOException e) {
            System.out.println("\nEnd of File! 2.nd method");
            ;
        }
    }

    static void readKIntegersReversed(String filename, long k) throws IOException {
        try (RandomAccessFile ran = new RandomAccessFile(filename, "r")) {

            ran.seek(ran.length() - 4);

            var i = 1;
            while (i <= k) {
                System.out.print(ran.readInt() + " ");
                ran.seek(ran.getFilePointer() - 8);
                i++;
            }

        } catch (IOException e) {
            System.out.println("\nEnd of File! 3.nd method");
        }
    }
}
