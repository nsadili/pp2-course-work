import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap();
        grades.put("Student1", 3.4);
        grades.put("Student2", 4.0);
        grades.put("Student3", 3.2);
        grades.put("Student4", 3.5);
        grades.put("Student4", 4.0);

        double max = 0;
        for(String m: grades.keySet()){
            if(grades.get(m) >= max){
                max = grades.get(m);
            }
        }

        System.out.println("Students with highest gpa: \n");
        for(String m: grades.keySet()){
            if(max == grades.get(m)){
                System.out.println(m + " : " + grades.get(m));
            }
        }
        System.out.println("\n");
        double sum = 0.0;
        int cnt =0;
        for(String m: grades.keySet()){
            sum+= grades.get(m);
            cnt++;
        }

        double average = sum / cnt;
        System.out.println("Average of students' grade: \n" + average);
        System.out.println("Students whose grades are less than average: ");
        for(String m: grades.keySet()){
            if(grades.get(m) < average){
                System.out.print(m + ": " + grades.get(m) + "\n");
            }
        }


    }
}
