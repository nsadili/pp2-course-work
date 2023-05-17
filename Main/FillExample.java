package Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Before fill: " + fruits);

        Collections.fill(fruits, "Peach");

        System.out.println("After fill: " + fruits);
    }
}
