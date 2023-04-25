import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiles {

    private static final int INT_SIZE_BYTES = 4;

    public static void generateFileWithRandomIntegers(String filename, int count) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
            for (int i = 0; i < count; i++) {
                int randomInt = (int) (Math.random() * Integer.MAX_VALUE);
                file.writeInt(randomInt);
            }
        }
    }

    public static int[] readIntegersFromFile(String filename) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            int count = (int) (file.length() / INT_SIZE_BYTES);
            int[] integers = new int[count];
            for (int i = 0; i < count; i++) {
                integers[i] = file.readInt();
            }
            return integers;
        }
    }

    public static void printIntegersFromFile(String filename, int offset, int count) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            file.seek(offset * INT_SIZE_BYTES);
            for (int i = 0; i < count; i++) {
                System.out.println(file.readInt());
            }
        }
    }

    public static void printIntegersFromFileReverse(String filename, int count) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            int totalIntegers = (int) (file.length() / INT_SIZE_BYTES);
            int offset = totalIntegers - count;
            if (offset < 0) {
                offset = 0;
                count = totalIntegers;
            }
            file.seek(offset * INT_SIZE_BYTES);
            for (int i = 0; i < count; i++) {
                System.out.println(file.readInt());
            }
        }
    }
}
