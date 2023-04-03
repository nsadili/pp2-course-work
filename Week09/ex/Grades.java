import java.util.Collections;
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

        TheHighestGPA(students);
        System.out.println();

        TheAverageGPA(students);
        System.out.println();

        TheLessThanAverage(students);
        System.out.println();

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

        // // find the highest gpa
        // while (it.hasNext()) {
        // double max = 0.0;

        // if (students.get(it.next()) > students.get(it.next())) // why not working???
        // max = students.get(it.next());

        // System.out.println(max);
        // }

    }

    static void TheHighestGPA(Map<String, Double> students) {
        double highestGPA = Collections.max(students.values());

        for (Map.Entry<String, Double> studentName : students.entrySet()) {
            if (studentName.getValue() == highestGPA) {
                System.out.println("The highest GPA --->" + studentName.getKey() + ": " + studentName.getValue());
            }
        }
    }

    static void TheAverageGPA(Map<String, Double> students) {
        double sum = 0.0;

        Iterator it = students.keySet().iterator();
        while (it.hasNext()) {
            var key = it.next();
            sum += students.get(key);
        }

        var ave = sum / (double) students.size();
        System.out.println("The average GPA ---> " + ave);
    }

    static void TheLessThanAverage(Map<String, Double> students) {
        double sum = 0.0;

        Iterator it = students.keySet().iterator();
        while (it.hasNext()) {
            var key = it.next();
            sum += students.get(key);
        }

        var ave = sum / (double) students.size();

        int cnt = 0;
        for (Map.Entry<String, Double> studentName : students.entrySet()) {

            if (studentName.getValue() < ave)
                cnt++;
        }

        System.out.println("The number of students less than the average ---> " + cnt);
    }
}
