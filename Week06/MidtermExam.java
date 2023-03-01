package Week06;

public class MidtermExam implements Exam {
    private boolean isFinished = false;
    private double grade;
    
    @Override
    public void start() {
        System.out.println("Midterm started");
    }
    
    @Override
    public void finish() {
        System.out.println("Midterm finished");
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
}

