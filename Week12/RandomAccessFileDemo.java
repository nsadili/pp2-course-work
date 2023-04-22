package Ex8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RandomAccessFileDemo {
public static void main(String[] args) {
String filename = "/Users/raqli/Desktop/pp2-course-work/Week12/Ex8/number.txt";
try {
    generateFileWithRandomIntegers(filename, 10, 10);

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
try (FileInputStream fis = new FileInputStream(filename); DataInputStream dis = new DataInputStream(fis)) {

    while (dis.available() > 0) {
        int r = dis.readInt();
        System.out.print(r + " ");
    }
}
}

static void readFromFile(String filename, int offset, int count) throws IOException {
try (FileInputStream fis = new FileInputStream(filename); DataInputStream dis = new DataInputStream(fis)) {

    fis.getChannel().position(offset * 4); // Each integer is 4 bytes

    for (int i = 0; i < count; i++) {
        int r = dis.readInt();
        System.out.print(r + " ");
    }
}
}

static void readKIntegersReversed(String filename, long k) throws IOException {
try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {

    long length = raf.length();
    long position = length - k * 4; // Each integer is 4 bytes

    if (position < 0) {
        position = 0;
    }

    raf.seek(position);

    for (int i = 0; i < k && position < length; i++) {
        int r = raf.readInt();
        System.out.print(r + " ");
        position += 4;
        raf.seek(position);
    }
}
}
}