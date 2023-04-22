import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFilesDemo {

    public static void main(String[] args) {
        String fileName = "random-integers.dat";
        int numIntegers = 10;
        int offset = 3;
        int count = 5;

        generateFileWithRandomIntegers(fileName, numIntegers);
        printFileContents(fileName);
        printIntegersFromOffset(fileName, offset, count);
        printIntegersFromEndOfTheFile(fileName, count);
    }

    public static void generateFileWithRandomIntegers(String fileName, int numIntegers) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(fileName, "rw");
            for (int i = 0; i < numIntegers; i++) {
                int value = (int) (Math.random() * 100);
                file.writeInt(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void printFileContents(String fileName) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(fileName, "r");
            while (file.getFilePointer() < file.length()) {
                int value = file.readInt();
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void printIntegersFromOffset(String fileName, int offset, int count) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(fileName, "r");
            file.seek(offset * 4);
            for (int i = 0; i < count; i++) {
                int value = file.readInt();
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void printIntegersFromEndOfTheFile(String fileName, int count) {
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(fileName, "r");
            long fileLength = file.length();
            for (int i = 0; i < count; i++) {
                file.seek(fileLength - (i + 1) * 4);
                int value = file.readInt();
                System.out.print(value + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
