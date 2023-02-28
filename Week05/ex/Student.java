package ex;

public class Student extends Person {
    private String studentId;
   
   public Student(String firstName, String lastName, String gender, String studentId) {
      super(firstName, lastName, gender);
      this.studentId = studentId;
   }
   
   // getters and setters
   public String getStudentId() {
      return studentId;
   }
   
   public void setStudentId(String studentId) {
      this.studentId = studentId;
   }
   
   // toString method
   public String toString() {
      return super.toString() + ", Student ID: " + studentId;
   }
   
   // equals method
   public boolean equals(Student s) {
      if (s == null) {
         return false;
      }
      if (!super.equals(s)) {
         return false;
      }
      Student student = (Student) s;
      return studentId.equals(student.studentId);
   }
}
