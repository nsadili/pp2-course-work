package Week09;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Grades {
    public static void main(String[] args) {
        double maxGpa = 0;
        double sum = 0, cnt = 0;
        int num = 0;

        Map<String, Double> students = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        students.put("Vasila", 3.47);
        students.put("Laman", 2.67);
        students.put("Rahima", 3.67);
        students.put("Ilaha", 2.67);

        for (var key : students.keySet()) {

            if (students.get(key) > maxGpa)
                maxGpa = students.get(key);
        }
        System.out.println("The highest gpa: " + maxGpa);

        for (var key : students.keySet()) {

            sum += students.get(key);
            cnt++;
        }

        double average = sum / cnt;
        System.out.println("Average gpa of all: " + average);

        for (var key : students.keySet()) {

            if (students.get(key) < average)
                num++;
        }

        System.out.println("Number of students have less than average gpa: " + num);

    }
}