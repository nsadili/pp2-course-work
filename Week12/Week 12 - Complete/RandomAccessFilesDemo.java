import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    static void readFromFile(String filename, int offset, int count) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                for (String part : parts) {
                    try {
                        numbers.add(Integer.parseInt(part));
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (offset < numbers.size()) {
            for (int i = offset; i < offset + count && i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }
        } else {
            System.out.println("Invalid offset");
        }
    }

    static void readKIntegersReversed(String filename, long k) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                for (String part : parts) {
                    try {
                        numbers.add(Integer.parseInt(part));
                    } catch (NumberFormatException ignored) {
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.reverse(numbers);

        long printCount = Math.min(k, numbers.size());
        for (int i = 0; i < printCount; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
