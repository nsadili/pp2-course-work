import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Double> numbers = new ArrayList<Double>();
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextDouble()) {
        numbers.add(sc.nextDouble());
    }

    sc.close();
    if (numbers.isEmpty()) {
        System.out.println("Please enter input!");
    }

    double sum = 0;
    for (double number : numbers) {
        sum += number;
    }

    double avarage = sum / numbers.size();
    System.out.println("The avarage of the given numbers is " + avarage);
  }
}
