package Week09;

import java.util.HashMap;

public class Grades {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();

        grades.put("Naik Pashayev", 3.4d);
        grades.put("Vidadi Nabiyev", 3.5d);
        grades.put("Isgandar Randomovich", 4.0d);

        double max = 0.0d;

        for(String g: grades.keySet()){
            if(grades.get(g).compareTo(max) > 0) max = grades.get(g); 
        }

        System.out.println("Highest GPA is: " + max);

        double sum = 0.0d;

        for(String a: grades.keySet()){
            sum += grades.get(a);
        }

        double average = 0.0d;

        average = sum / grades.size();
        System.out.println("The average of GPA's is: " + average);

        int studentsLessThanAverage = 0;

        for(String l: grades.keySet()){
            if(grades.get(l) < average) studentsLessThanAverage++;
        }

        System.out.println("Students who has less than average: " + studentsLessThanAverage);
    }
}
