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

    
    
    
    public double[] getAssignmentGrades() {
        return assignmentGrades;
    }
    
    public MidtermExam getMidtermResult() {
        return midtermResult;
    }
    
    public double[] getQuizGrades() {
        return quizGrades;
    }

    public void setAssignmentGrades(double[] assignmentGrades) {
        this.assignmentGrades = assignmentGrades;
    }

    public void setExamOver(boolean examOver) {
        ExamOver = examOver;
    }

    public void setMidtermResult(MidtermExam midtermResult) {
        this.midtermResult = midtermResult;
    }

    public void setQuizGrades(double[] quizGrades) {
        this.quizGrades = quizGrades;
    }

    public double calcTotal() {
        if (!ExamOver) {
            return -1;
        }
        double total = grade;
        for (double aGrade : assignmentGrades) {
            total += aGrade;
        }
        for (double qGrade : quizGrades) {
            total += qGrade;
        }
        total += midtermResult.getGrade();
        return total;
    }
}







    

