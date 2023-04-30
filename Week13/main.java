import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
   
public static void main(String args[]) {
 String fn = "data.txt";
try (var w = new BufferedWriter(new FileWriter(fn)); var s = System.out) {
    w.write("Hi, there!");

    w.flush();

    w.write('!');

    System.out.print("1");
} catch (IOException e) {
    System.out.print("2");
} finally {
    System.out.print("3");
}
}
}