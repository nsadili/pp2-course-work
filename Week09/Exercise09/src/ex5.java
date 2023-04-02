import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // a
        Map<String, Double> studentGpa = new HashMap<>();

        // b
        populateStudents(studentGpa);
        System.out.println(studentGpa);

        // c, d
        System.out.println("Students with highest:");
        Double max = 0.0;
        for (String s: studentGpa.keySet()) {
            if (studentGpa.get(s) > max)
                max = studentGpa.get(s);
        }

        Double sum = 0.0;
        for (String s: studentGpa.keySet()) {
            sum += studentGpa.get(s);
            if (studentGpa.get(s).equals(max))
                System.out.println(s + ": " + studentGpa.get(s));
        }

        Double avg = sum / studentGpa.size();
        System.out.println("Average: " + avg);

        // e
        System.out.println("Students below average:");
        for (String s: studentGpa.keySet()) {
            if (studentGpa.get(s) < avg)
                System.out.println(s + ": " + studentGpa.get(s));
        }
    }

    public static Map<String, Double> populateStudents(Map<String, Double> m) {
        Scanner scn = new Scanner(System.in);
        int cnt = 0;
        while (cnt < 5) {
            String name = scn.next();
            Double age = scn.nextDouble();
            m.put(name, age);
            cnt++;
        }
        scn.close();

        return m;
    }
}
