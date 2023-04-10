package Week09;

import java.util.HashMap;
import java.util.Map;

public class Grades{
    public static void main(String[] args) {
        Map<String, Double> studentGPAs = new HashMap<>();
        studentGPAs.put("Eljan", 3.0);
        studentGPAs.put("Namiq", 2.3);
        studentGPAs.put("Toghrul", 3.3);
        studentGPAs.put("Ali", 2.0);

        String nameOfTheHighestGpaStudent = null;
        double highestGPA = 0.0;
        double sumOfGPAs = 0.0;
        for (Map.Entry<String, Double> x:studentGPAs.entrySet()) {
            if(x.getValue() > highestGPA){
                nameOfTheHighestGpaStudent = x.getKey();
                highestGPA = x.getValue();
            }
            sumOfGPAs = sumOfGPAs + x.getValue();
        }
        int cnt = 0;
        for (Map.Entry<String, Double> x:studentGPAs.entrySet()) {
            if(x.getValue() < sumOfGPAs/studentGPAs.size()){
                cnt++;
            }
        }

        System.out.println("Student with the highest GPA is " + nameOfTheHighestGpaStudent +
                " and student's GPA is " + highestGPA);
        System.out.println("Average GPA is " + sumOfGPAs/studentGPAs.size());

        System.out.println("The number of students who have less GPA than the average is " + cnt);

    }

}