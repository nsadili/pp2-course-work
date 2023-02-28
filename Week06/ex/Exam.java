public interface Exam {
    void start();
    void finish();
    boolean isOver();
    void setGrade();
    double getGrade();
}

abstract class MidtermExam implements Exam {

    double grade;
    boolean a;

    public void start() {
        System.out.println("Midterm started"); 
    }

    public void finish() {
        System.out.println("Midterm finished");
    }

    public boolean isOver() {
        return "Midterm finished".equals(a);
    }
    public void setGrade(int i) {
        System.out.println(); // ....
    }

    public double getGrade() {
        return getGrade();
    }
}

    abstract class FinalExam implements Exam {

        boolean a;
        double grade;
        double [] assignmentGrades;
        double [] quizGrades;
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
        }

        public boolean isOver() {
            return "Final finished".equals(a);
        }

        public void setGrade(int i) {
            System.out.println(); // ....
        }
    
        public double getGrade() {
            return getGrade();
        }

        public boolean isA() {
            return a;
        }

        public void setA(boolean a) {
            this.a = a;
        }

        public int calcTotal(int f) {
            if (f.finish() == "Final finished")
            sum[] = quizGrades + assignmentGrades + midtermResult;
            return sum;
        }
    }

        //// How to solve it ?



   