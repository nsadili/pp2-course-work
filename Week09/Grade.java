package Week09;

import java.util.HashMap;

public class Grade {
    public static void main(String[] args) {
        HashMap<String, Float> grades = new HashMap<>();

        grades.put("Ilaha Jamalli", 2.8f);
        grades.put("Nihat Ahmadli", 4.0f);
        grades.put("Inji Sadigli", 1.79f);

        float maxGrade = Float.MIN_VALUE;
        for (String student : grades.keySet()) {
            System.out.println(grades.get(student));

            float currentGrade = grades.get(student);
            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
            }
        }

        System.out.println("Max Grade: " + maxGrade);

        for (String student : grades.keySet()) {
            if (grades.get(student) < maxGrade) {
                System.out.println(student);
            }
        }
    }
}
