package Week09;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> grades = new LinkedHashMap<>();
        grades.put("Nijat", 4.0);
        grades.put("Bahadur", 4.0);
        grades.put("Test2", 2.5);
        grades.put("Test3", 2.2);
        grades.put("Telman", 3.5);
        grades.put("Nijat1", 3.1);
        grades.put("Sabir", 2.7);
        grades.put("Memmed", 2.0);
        grades.put("Test1", 1.0);

        System.out.println(grades);

        System.out.println(findMaxstudent(grades));
        System.out.println(findAverage(grades));
        System.out.println(numOfLessThanAverage(grades));

        System.out.println("Printing name of students whose gpa less than average:");

        var st = mapOfLessThanAverage(grades);
        Iterator<String> it = st.keySet().iterator();

        while (it.hasNext()) {
            var next = it.next();
            System.out.println(next + ": " + grades.get(next));
        }

    }

    static Map<String, Double> findMaxstudent(Map<String, Double> grades) {

        Map<String, Double> res = new LinkedHashMap<>();
        var max = Double.MIN_VALUE;
        for (var student : grades.keySet()) {
            if (grades.get(student) >= max) {
                max = grades.get(student);
            }

        }

        for (var student : grades.keySet()) {
            if (grades.get(student) == max) {
                res.put(student, max);
            }

        }

        return res;

    }

    static double findAverage(Map<String, Double> grades) {

        var sum = 0.0;
        var lenght = grades.size();

        for (var student : grades.keySet()) {
            sum += grades.get(student);
        }

        return sum / lenght;

    }

    static int numOfLessThanAverage(Map<String, Double> grades) {

        var average = findAverage(grades);
        var num = 0;

        for (var student : grades.entrySet()) {
            if (student.getValue() < average)
                num++;

        }

        return num;

    }

    static Map<String, Double> mapOfLessThanAverage(Map<String, Double> grades) {

        var average = findAverage(grades);
        Map<String, Double> res = new TreeMap<>();

        for (var student : grades.entrySet()) {
            if (student.getValue() < average)
                res.put(student.getKey(), student.getValue());

        }

        return res;

    }
}