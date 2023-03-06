package Week06;

abstract class MidtermExam implements Exam{
    private double grade;
    public void start(){
        System.out.println("Midterm started");
    }
    public void finish(){
        System.out.println("Midterm finished");
    }
    public boolean isOver(){
        return true;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
}
