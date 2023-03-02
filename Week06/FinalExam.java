package Week06;

public class FinalExam implements Exam{
    boolean ExamOver = true;
    double grade;
    double [] assignmentGrades;
    double [] quizGrades;
    MidtermExam midtermResult;
    
    public void start(){
        System.out.println("Final started");
    }

    public void finish(){
        System.out.println("Final finished");
    }
    
    public boolean isOver(){
        return ExamOver;
    }

    public void setGrade(double grade){
        this.grade = grade;

    }
    public double getGrade() {
        return grade;
    }

    
}
