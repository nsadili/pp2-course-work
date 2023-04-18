package Week09.pw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> students = new HashMap<>();

        students.put("Jesika", 2.90);
        students.put("Eynulla", 3.60);
        students.put("Ahmed", 1.90);
        students.put("Leyla", 3.65);
        students.put("Aygun", 2.45);
        students.put("Woody", 2.87);
        students.put("Ayten", 1.73);

        TheHighestGPA(students);
        System.out.println();

        TheAverageGPA(students);
        System.out.println();

        TheLessThanAverage(students);
        System.out.println();

        System.out.println(students);
        System.out.println();

        for (String names : students.keySet()) {
            System.out.println(names + ":  " + students.get(names));
        }

        System.out.println();
        Iterator<String> it = students.keySet().iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = students.get(key);
            System.out.println(key + ":  " + value);

        }
        System.out.println();
    }

    static void TheHighestGPA(Map<String, Double> students) {
        double highestGPA = Collections.max(students.values());

        for (Map.Entry<String, Double> studentName : students.entrySet()) {
            if (studentName.getValue() == highestGPA) {
                System.out.println("The highest GPA among students --->" + studentName.getKey() + ": " + studentName.getValue());
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
        System.out.println("The average GPA is equal to --->" + ave);
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
        System.out.println("The number of students who are less than the average number is --->" + cnt);
    }
}
