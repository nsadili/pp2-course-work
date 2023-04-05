public class GradesTest {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.addStudent("Vusal", 3.8);
        grades.addStudent("Ali", 2.5);
        grades.addStudent("Mahir", 4.0);
        grades.addStudent("Leila", 3.3);

        grades.printHighestGPA();
        grades.printAverageGPA();
        grades.printNumBelowAverage();
    }
}
