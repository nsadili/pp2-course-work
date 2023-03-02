public interface Exam {
    void start();

    void finish();

    boolean isOver();

    void setGrade(double g);

    double getGrade();
}

class MidtermExam implements Exam {

    double grade;
    boolean isFinished;

    public void start() {
        System.out.println("Midterm started");
    }

    public void finish() {
        System.out.println("Midterm finished");
    }

    public boolean isOver() {
        return "Midterm finished".equals(isFinished);
    }

    public double getGrade() {
            return getGrade();
        }

    public void setGrade(double g) {
        System.out.println(); 
    }

   
}

class FinalExam implements Exam {

    boolean isFinished;
    double grade;
    double[] assignmentGrades;
    double[] quizGrades;
    MidtermExam midtermResult;

    public double[] getAssignmentGrades() {
        return assignmentGrades;
    }

    public double[] getQuizGrades() {
        return quizGrades;
    }

    public MidtermExam getMidtermResult() {
        return midtermResult;
    }

    public void setAssignmentGrades(double[] assignmentGrades) {
        this.assignmentGrades = assignmentGrades;
    }

    public void setQuizGrades(double[] quizGrades) {
        this.quizGrades = quizGrades;
    }

    public void setMidtermResult(MidtermExam midtermResult) {
        this.midtermResult = midtermResult;
    }

    public void start() {
        System.out.println("Final started");
    }

    public void finish() {
        System.out.println("Final finished");
        this.isFinished = true;
    }

    public boolean isOver() {
        return "Final finished".equals(isFinished);
    } 
    
    public double getGrade() {
        return getGrade();
    }

    public void setGrade(double g) {
        System.out.println(); 
    }

    public int calcTotal() { 
        var sum = 0;
        if (this.isOver()) {
           for (int i = 0; i < assignmentGrades.length; i++) {
            sum += assignmentGrades[i];
           }
            
           for(int i = 0; i < quizGrades.length; i++) {
            sum += quizGrades[i];
           }

          //  int res = sum + (int) grade + () midtermResult; // ???

            return /*res*/ 0;
        }
            else 
        return -1;
    }
}


