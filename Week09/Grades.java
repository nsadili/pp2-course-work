package Week09;
import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Map<String, Float> studentsGPA = new HashMap<>();

        studentsGPA.put("Keanu Reeves", 3.7f);
        studentsGPA.put("Jhon Wick", 2.6f);
        studentsGPA.put("Jonny Bernthal", 3f);
        studentsGPA.put("Farid Aliyev", 1.8f);
        studentsGPA.put("Orkhan Valiyev", 4f);

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
