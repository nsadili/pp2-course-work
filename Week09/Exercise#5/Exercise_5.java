import java.util.*; //this import helps us to import all the classes in the java.util package including those what we need: HashMap, TreeMap etc.

/*
Writing main class by writing the name same to the name of the file (Exercsie_5.java)
1. Firstly, we create a map to store student names, as well as their GPA grades. Then inside the map we write/put 
names of our students and their GPA.
2. Then, we declare/create a method, which will help us to indicate a student with the highest GPA grade. 
Inside the loop, which is created at the beginning, the code compares the current GPA to the highestGpa variable, which initially is set to the 
smallest possible value for a double. If the current GPA is greater than highestGpa, then highestGpa is updated
 to the current GPA, and the highestGpaStudents list is cleared and the current student's name is added to the list. 
 If the current GPA is equal to highestGpa, then the current student's name is simply added to the highestGpaStudents list.
 Note: to make this process workable, we declare highestGPA, which is very important to connect all process inside the loop.
 3. The third step is finding the average, which is the easiest part of the code, because everything we do is finding average by summing all 
 grades and diving them on the size of the Map (number of students = size of the Map).
 4. Fourth step is similar to third. We just compare students' GPA with average one by plusing their amount. 
Basically, on the fourth step the writing of the code ends, because we've already written everything in the "public sttic void main", so
after running the code, everything will run in an appropriate way. 
 */

public class Exercise_5 {
    public static void main(String[] args) {
        Map<String, Double> studentGpaMap = new HashMap<>();
    
        studentGpaMap.put("Ramil", 1.2);
        studentGpaMap.put("Ramazanov", 3.7);
        studentGpaMap.put("Farid", 3.6);
        studentGpaMap.put("Javid", 3.6);
        studentGpaMap.put("Samir", 2.0);
        
        double highestGpa = Double.MIN_VALUE;
        List<String> highestGpaStudents = new ArrayList<>();
        for (Map.Entry<String, Double> entry : studentGpaMap.entrySet()) {
            String student = entry.getKey();
            double gpa = entry.getValue();
            if (gpa > highestGpa) {
                highestGpa = gpa;
                highestGpaStudents.clear();
                highestGpaStudents.add(student);
            } else if (gpa == highestGpa) {
                highestGpaStudents.add(student);
            }
        }
        System.out.println("Student(s) with the highest GPA: " + highestGpaStudents + " (GPA: " + highestGpa + ")");
        
        double sum = 0.0;
        for (double gpa : studentGpaMap.values()) {
            sum += gpa;
        }
        double averageGpa = sum / studentGpaMap.size();
        System.out.println("Average GPA of all students: " + averageGpa);
        
        int count = 0;
        for (double gpa : studentGpaMap.values()) {
            if (gpa < averageGpa) {
                count++;
            }
        }
        System.out.println("Number of students who have less GPA than the average: " + count);
    }
}
