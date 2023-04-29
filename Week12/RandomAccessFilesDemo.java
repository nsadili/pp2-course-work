import java.io.*;

public class RandomAccessFilesDemo {
    private static final int NUM_VALUES = 10;
    private static final int VALUE_SIZE = Integer.BYTES;

    public static void main(String[] args) {
        String fileName = "randomIntegers.bin";
        generateFileWithRandomIntegers(fileName, NUM_VALUES);

        System.out.println("Contents of the file:");
        int[] fileContents = readContentsFromFile(fileName);
        for (int value : fileContents) {
            System.out.println(value);
        }

        int offset = 2;
        int count = 3;
        System.out.printf("Values starting at offset %d and count %d:%n", offset, count);
        printValuesAtOffset(fileName, offset, count);

        int reverseCount = 4;
        System.out.printf("Last %d values in reverse order:%n", reverseCount);
        printValuesFromEndOfFile(fileName, reverseCount);
    }

    private static void generateFileWithRandomIntegers(String fileName, int numValues) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            for (int i = 0; i < numValues; i++) {
                int value = (int) (Math.random() * 100);
                file.writeInt(value);
            }
        } catch (IOException e) {
            System.err.println("Error generating file: " + e.getMessage());
        }
    }

    private static int[] readContentsFromFile(String fileName) {
        int[] fileContents = new int[NUM_VALUES];
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            for (int i = 0; i < NUM_VALUES; i++) {
                fileContents[i] = file.readInt();
            }
        } catch (IOException e) {
            System.err.println("Error reading file contents: " + e.getMessage());
        }
        return fileContents;
    }

    private static void printValuesAtOffset(String fileName, int offset, int count) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            file.seek(offset * VALUE_SIZE);
            for (int i = 0; i < count; i++) {
                int value = file.readInt();
                System.out.println(value);
            }
        } catch (IOException e) {
            System.err.println("Error printing values at offset: " + e.getMessage());
        }
    }

    private static void printValuesFromEndOfFile(String fileName, int count) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            long fileLength = file.length();
            long startPosition = fileLength - (count * VALUE_SIZE);
            if (startPosition < 0) {
                startPosition = 0;
            }
            file.seek(startPosition);
            for (int i = 0; i < count; i++) {
                int value = file.readInt();
                System.out.println(value);
                file.seek(file.getFilePointer() - (2 * VALUE_SIZE));
            }
        } catch (IOException e) {
            System.err.println("Error printing values from end of file: " + e.getMessage());
        }
    }
}
