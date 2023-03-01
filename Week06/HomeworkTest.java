package Week06;

public class HomeworkTest {
    public static void main(String args[]) {
    MidtermExam m = new MidtermExam();
    m.setGrade(21);
    double [] assg = { 7, 5, 8, 5};
    double [] quiz = { 3, 2, 5, 2, 3};
    FinalExam f = new FinalExam();
    f.setAssignmentGrades(assg);
    f.setQuizGrades(quiz);
    f.setMidtermResult(m);
    f.setGrade(23);
    f.finish();
    double total = f.calcTotal();
    System.out.println("Your total grade is: "+total);
    }
    }