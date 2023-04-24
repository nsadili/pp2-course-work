import java.io.*;
import java.util.*;

public class RandomAccessFilesDemo {

    private static final int INT_SIZE = 4;

    public static void main(String[] args) throws IOException {

        String fileName = "numbers.dat";
        generateFileWithRandomIntegers(fileName, 20);

        System.out.println("File contents:");
        readAllFileContents(fileName);
        System.out.println();

        int offset = 4;
        int count = 3;
        System.out.printf("Integers from offset %d, count %d:\n", offset, count);
        printIntegersFromOffset(fileName, offset, count);
        System.out.println();

        int countFromEnd = 5;
        System.out.printf("Integers from end, count %d:\n", countFromEnd);
        printIntegersFromEnd(fileName, countFromEnd);
    }

    // Generates a file with 'count' number of random integers
    private static void generateFileWithRandomIntegers(String fileName, int count) throws IOException {
        Random rand = new Random();
        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            for (int i = 0; i < count; i++) {
                file.writeInt(rand.nextInt(100));
            }
        }
    }

    // Reads all the contents of a file and prints them
    private static void readAllFileContents(String fileName) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            long length = file.length();
            long numIntegers = length / INT_SIZE;
            for (int i = 0; i < numIntegers; i++) {
                int number = file.readInt();
                System.out.print(number + " ");
            }
        }
    }

    // Prints 'count' number of integers from the file starting from 'offset'
    private static void printIntegersFromOffset(String fileName, int offset, int count) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            file.seek(offset * INT_SIZE);
            for (int i = 0; i < count; i++) {
                int number = file.readInt();
                System.out.print(number + " ");
            }
        }
    }

    // Prints 'count' number of integers from the end of the file in reverse order
    private static void printIntegersFromEnd(String fileName, int count) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            long length = file.length();
            long numIntegers = length / INT_SIZE;
            long position = (numIntegers - count) * INT_SIZE;
            if (position < 0) {
                position = 0;
            }
            file.seek(position);
            for (int i = 0; i < count; i++) {
                int number = file.readInt();
                System.out.print(number + " ");
                file.seek(file.getFilePointer() - (2 * INT_SIZE));
            }
        }
    }
}
