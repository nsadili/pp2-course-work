class FinalExam extends MidtermExam implements Exam{
    private double[] assignmentGrades;
    private double[] quizGrades;
    private MidtermExam midtermResults;

    public double[] getAssignmentGrades() {
        return this.assignmentGrades;
    }

    public void setAssignmentGrades(double[] arr) {
        this.assignmentGrades=new double[arr.length];
        for(int i=0;i<arr.length;i++) {
            this.assignmentGrades[i]=arr[i];
        }
    }

    public double[] getQuizGrades() {
        return this.quizGrades;
    }

    public void setQuizGrades(double[] arr) {
        this.quizGrades=new double[arr.length];
        for(int i=0;i<arr.length;i++) {
            this.quizGrades[i]=arr[i];
        }
    }

    public double getMidtermResult() {
        return this.midtermResults.getGrade();
    }

    public void setMidtermResult(MidtermExam m) {
        this.midtermResults=new MidtermExam();
        this.midtermResults.setGrade(m.getGrade());
    }

    public double calcTotal() {
        if(this.over) {
            double sum=0;
            
            for(int i=0;i<this.assignmentGrades.length;i++) {
                sum+=this.assignmentGrades[i];
            }

            for(int i=0;i<this.quizGrades.length;i++) {
                sum+=this.quizGrades[i];
            }

            return sum+this.getMidtermResult()+this.getGrade();
        }
        else return -1;
    }
}
