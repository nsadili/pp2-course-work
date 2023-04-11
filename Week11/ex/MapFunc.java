import java.util.HashMap;
import java.util.Map;

public class MapFunc {
    public static void main(String[] args) {
        Map<String, Double> hmGpa = new HashMap<String, Double>();
        hmGpa.put("Samir", 2.99);
        hmGpa.put("Aydin", 3.55);
        hmGpa.put("Nurane", 3.84);
        // just printing
        hmGpa.forEach((k, v) -> System.out.println("Student : " + k + " GPA : " + v));

        // adding some logic to the printing
        hmGpa.forEach((k, v) -> {
            if (v > 3.5)
                System.out.print("Excellent ");
            System.out.println("Student : " + k + " GPA : " + v);
        });

    }
}
