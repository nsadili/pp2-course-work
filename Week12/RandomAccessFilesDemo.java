package Week12;

import java.io.*;

public class RandomAccessFilesDemo {

    private static final int INT_SIZE_BYTES = 4;

    public static void main(String[] args) throws IOException {
        String filename = "numbers.bin";
        generateFileWithRandomIntegers(filename, 100);
        readAllFileContents(filename);
        printIntegersFromOffset(filename, 8, 5);
        printIntegersFromEndOfFile(filename, 5);
    }

    public static void generateFileWithRandomIntegers(String filename, int numIntegers) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filename, "rw");
        for (int i = 0; i < numIntegers; i++) {
            int randomNumber = (int) (Math.random() * 100);
            raf.writeInt(randomNumber);
        }
        raf.close();
    }

    public static void readAllFileContents(String filename) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filename, "r");
        long fileLength = raf.length();
        int numIntegers = (int) (fileLength / INT_SIZE_BYTES);

        System.out.println("Reading all contents of the file:");
        for (int i = 0; i < numIntegers; i++) {
            int number = raf.readInt();
            System.out.print(number + " ");
        }
        System.out.println();
        raf.close();
    }

    public static void printIntegersFromOffset(String filename, long offset, int count) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filename, "r");
        raf.seek(offset);
        System.out.println("Printing " + count + " integers from offset " + offset + ":");
        for (int i = 0; i < count; i++) {
            int number = raf.readInt();
            System.out.print(number + " ");
        }
        System.out.println();
        raf.close();
    }

    public static void printIntegersFromEndOfFile(String filename, int count) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(filename, "r");
        long fileLength = raf.length();
        int numIntegers = (int) (fileLength / INT_SIZE_BYTES);

        System.out.println("Printing " + count + " integers from the end of the file in reverse order:");
        for (int i = numIntegers - count; i < numIntegers; i++) {
            raf.seek(i * INT_SIZE_BYTES);
            int number = raf.readInt();
            System.out.print(number + " ");
        }
        System.out.println();
        raf.close();
    }
}
