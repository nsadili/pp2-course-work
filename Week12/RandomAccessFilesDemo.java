package Week12;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFilesDemo {
    public static void main(String[] args) {
        String filename = "data.bin";
        int numIntegers = 10;
        int offset = 3;
        int count = 4;
        int reverseCount = 5;

        generateFileWithRandomIntegers(filename, numIntegers);
        readAllFileContents(filename);
        printIntegersFromOffset(filename, offset, count);
        printIntegersFromEndReverse(filename, reverseCount);
    }

    public static void generateFileWithRandomIntegers(String filename, int numIntegers) {
        try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
            for (int i = 0; i < numIntegers; i++) {
                int randomNumber = (int) (Math.random() * 100);
                file.writeInt(randomNumber);
            }
            System.out.println("File generated with random integers.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAllFileContents(String filename) {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            System.out.println("File Contents:");
            while (file.getFilePointer() < file.length()) {
                int number = file.readInt();
                System.out.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printIntegersFromOffset(String filename, int offset, int count) {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            file.seek(offset * 4); // Each integer is 4 bytes long
            System.out.println("Integers from offset " + offset + " (Count: " + count + "):");
            for (int i = 0; i < count; i++) {
                int number = file.readInt();
                System.out.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printIntegersFromEndReverse(String filename, int count) {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            long length = file.length();
            long startPosition = length - (count * 4); // Each integer is 4 bytes long
            if (startPosition < 0) {
                startPosition = 0;
                count = (int) (length / 4);
            }
            file.seek(startPosition);
            System.out.println("Integers from the end in reverse order (Count: " + count + "):");
            for (int i = 0; i < count; i++) {
                int number = file.readInt();
                System.out.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
