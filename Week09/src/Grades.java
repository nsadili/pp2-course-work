import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> gradesMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int NumOfStudents = sc.nextInt();
        String str = sc.nextLine();

        for (int i = 0; i < NumOfStudents; i++) {
            System.out.println("Enter the name of student " + (i+1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter the GPA of student " + (i+1) + ":");
            double gpa = sc.nextDouble();
            sc.nextLine();
            gradesMap.put(name, gpa);
        }

        String highestGPAStudent = null;
        double highestGPA = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : gradesMap.entrySet()) {
            if (entry.getValue() > highestGPA) {
                highestGPA = entry.getValue();
                highestGPAStudent = entry.getKey();
            }
        }
        System.out.println("Student with highest GPA: " + highestGPAStudent + " (" + highestGPA + ")");

        double sumGPA = 0;
        for (double gpa : gradesMap.values()) {
            sumGPA += gpa;
        }
        double avgGPA = sumGPA / gradesMap.size();
        System.out.println("Average GPA: " + avgGPA);

        int countBelowAvg = 0;
        for (double gpa : gradesMap.values()) {
            if (gpa < avgGPA) {
                countBelowAvg++;
            }
        }
        System.out.println("Number of students with GPA below average: " + countBelowAvg);

    }

}
