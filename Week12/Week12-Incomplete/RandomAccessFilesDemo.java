import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessFilesDemo {
    public static void main(String[] args) {
        String filename = "Resources/random/numbers.dat";

        try {
            generateFileWithRandomIntegers(filename, 10, 10);

            readFromFile(filename);
            System.out.println();

            readFromFile(filename, 7, 5);
            System.out.println();

            readKIntegersReversed(filename, 15);
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
                System.out.print(r+" ");
                dos.writeInt(r);
            }
            System.out.println();
        }
    }

    static void readFromFile(String filename) throws IOException {
        try (RandomAccessFile fis = new RandomAccessFile(filename, "r")) {
            long length = fis.length()/4;
            while (length-->0){
                System.out.print(fis.readInt()+" ");
            }
        }
    }

    static void readFromFile(String filename, int offset, int count) throws IOException {
        try (RandomAccessFile fis = new RandomAccessFile(filename, "r")) {
            fis.seek(offset*4);
            while (count-->0){
                System.out.print(fis.readInt()+" ");
            }
        }
    }

    static void readKIntegersReversed(String filename, long k) throws IOException {
        try (RandomAccessFile fis = new RandomAccessFile(filename, "r")) {
            long num = fis.length()/4;
            if (k>num){
                k=num;
            }
            for (int i=0; i<k; i++){
                fis.seek((num-i-1)*4);
                System.out.print(fis.readInt()+" ");
            }
        }
    }
}
