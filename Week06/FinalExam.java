package Week06;

public class FinalExam implements Exam {
    private boolean isFinished = false;
    private double grade;
    private double[] assignmentGrades;
    private double[] quizGrades;
    private MidtermExam midtermResult;

    public double[] getAssignmentGrades() {
        return assignmentGrades;
    }
    
    public void setAssignmentGrades(double[] assignmentGrades) {
        this.assignmentGrades = assignmentGrades;
    }
    
    public double[] getQuizGrades() {
        return quizGrades;
    }

    public void setQuizGrades(double[] quizGrades) {
        this.quizGrades = quizGrades;
    }
    
    public MidtermExam getMidtermResult() {
        return midtermResult;
    }
    
    public void setMidtermResult(MidtermExam midtermResult) {
        this.midtermResult = midtermResult;
    }
    
    @Override
    public void start() {
        System.out.println("Final started");
    }
    
    @Override
    public void finish() {
        System.out.println("Final finished");
        isFinished = true;
    }
    
    @Override
    public boolean isOver() {
        return isFinished;
    }
    
    @Override
    public void setGrade(double g) {
        grade = g;
    }
    
    @Override
    public double getGrade() {
        return grade;
    }
    public double calcTotal() {
        if (!isFinished) {
            return -1;
        }
        
        double total = 0;
        for (double assignmentGrade : assignmentGrades) {
            total += assignmentGrade;
        }
        
        for (double quizGrade : quizGrades) {
            total += quizGrade;
        }
        
        total += midtermResult.getGrade();
        total += grade;
        
        return total;
    }
}
