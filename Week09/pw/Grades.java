import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> students = new HashMap<>();

        students.put("Laman", 3.47);
        students.put("Vasila", 3.25);
        students.put("Shamil", 4.00);
        students.put("Rasul", 2.86);
        students.put("Nazrin", 3.13);
        students.put("Elnara", 2.25);
        students.put("Miray", 1.97);

        System.out.println(students);

        System.out.println();

        for (String names : students.keySet()) {
            System.out.println(names + ": " + students.get(names));
        }

        System.out.println();

        Iterator<String> it = students.keySet().iterator();

        while (it.hasNext()) {
            Object key = it.next();
            Object value = students.get(key);
            System.out.println(key + ": " + value);

        }

        System.out.println();

        // find the highest gpa
        while (it.hasNext()) {
            double max = 0;
            // for (var name : students.keySet()) {
            // it.next();
            // if (students.get(it.next()) > students.get(name)) {

            // max = students.get(it.next());
            // }

            if (students.get(it.next()) > students.get(it.next()))
                max = students.get(it.next());

            System.out.println(max);
            // }

        }

        // the average gpa of all the students // 2.99
        double sum = 0.0;
        while (it.hasNext()) {
            var key = it.next();
            sum += students.get(key);
        }

        var ave = sum / (double) students.size();
        System.out.println(ave);

        // Find the number of students who have less gpa than the average
        int cnt = 0;
        while (it.hasNext()) {
            if (students.get(it.next()) < ave)
                cnt++;
        }

        System.out.println(cnt);
    }
}
