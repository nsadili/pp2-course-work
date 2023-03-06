package Week06;

abstract class FinalExam implements Exam{
    private double [] assignmentGrades; 
    private double grade;
    private double [] quizGrades;
    private MidtermExam midtermResult; 
     public double getGrade() {
         return grade;
     }
     public void setGrade(double grade) {
         this.grade = grade;
     }
     public void start(){
         System.out.println("Final started");
     }
     public void finish(){
         System.out.println("Final finished");
     }
     public boolean isOver(){
         return true;

     }
     
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
     
     public double sumofAssignment(){
         double sum=0.0;
         for(int i=0;getAssignmentGrades().length>i;i++){
             sum=sum+getAssignmentGrades()[i];
         }
         return sum;
     
     }
     public double sumofQuiz(){
         double sum=0.0;
         for(int i=0;getQuizGrades().length>i;i++){
            sum=sum+getQuizGrades()[i];
         }
         return sum;
     
     }
     

     public double calcTotal(){
         if(isOver()==true){
             return sumofAssignment()+sumofQuiz()+getGrade()+midtermResult.getGrade();
         }
         else return -1;
     }
 }
