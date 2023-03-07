class MidtermExam implements Exam {
    boolean over=false;
    private double grade;

    public void start() {
        System.out.println("Midterm started");
    }

    public void finish() {
        System.out.println("Midterm finished");
        this.over=true;
    }

    public boolean isOver() {
        return this.over;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double g) {
        this.grade=g;
    }

}
