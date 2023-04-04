import java.util.HashMap;
import java.util.Map;

public class Grades {

    private Map<String, Double> sGPA;

    public static void main(String[] args) {

        Grades grades = new Grades();

        grades.addStudent("Student 1", 2.3);
        grades.addStudent("Student 2", 2.7);
        grades.addStudent("Student 3", 3.1);
        grades.addStudent("Student 4", 3.6);


        System.out.println("Student who get highest GPA: " + grades.HighestGpaStudent());
        System.out.println("Average of GPA: " + grades.AvGPA());
        System.out.println("Number of students whose GPA is less than average: " + grades.BelowAv());
    }


    public Grades() {
        this.sGPA = new HashMap<>();
    }

    public void addStudent(String name, double gpa) {
        sGPA.put(name, gpa);
    }


    public String HighestGpaStudent() {

        double maxGPA = 0;
        String topStudent = "";

        for (Map.Entry<String, Double> entry : sGPA.entrySet()) {
            if (entry.getValue() > maxGPA) {
                maxGPA = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        return topStudent;
    }


    public double AvGPA() {

        double sum = 0.0;

        for (double gpa : sGPA.values()) {
            sum += gpa;
        }
        return sum / sGPA.size();
    }



    public int BelowAv() {

        double averageGPA = AvGPA();

        int cnt = 0;
        for (double gpa : sGPA.values()) {
            if (gpa < averageGPA) {
                cnt++;
            }
        }
        return cnt;
    }
}