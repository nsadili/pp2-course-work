package Week09;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Float> studentsGPA = new HashMap<>();

        studentsGPA.put("John Wick", 3.2f);
        studentsGPA.put("Gustavo Fring", 4f);
        studentsGPA.put("Jesse Pinkman", 1f);
        studentsGPA.put("Hector Salamanca", 2f);
        studentsGPA.put("Walter White", 4f);

        Float maxGPA = Collections.max(studentsGPA.values());

        for (Map.Entry<String, Float> entry: studentsGPA.entrySet()) {
            if (entry.getValue().compareTo(maxGPA) == 0)
                System.out.println(entry.getKey() + " has maximum GPA: " + entry.getValue());
        }

        double average = studentsGPA.values().stream()
                .mapToDouble(Float::floatValue)
                .average()
                .orElse(0.0);
        System.out.printf("\nAverage GPA is: %.3f\n", average);

        List<Float> lessThanAverage = studentsGPA.values().stream()
                .filter(value -> value < average)
                .toList();

        System.out.println("Number of students who has less gpa than the average is: " + lessThanAverage.size());
    }
}