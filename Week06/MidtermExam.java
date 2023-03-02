package Week06;

public class MidtermExam implements Exam{
    boolean ExamOver = true;
    double grade;
    public void start(){
        System.out.println("MidTerm started");
    }

    public void finish(){
        System.out.println("MidTerm finished");
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
