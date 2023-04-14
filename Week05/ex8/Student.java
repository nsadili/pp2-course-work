package WEEK5.ex8;

public class Student extends Person{
    String studentId;

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + "]";
    }
    public void equals(Student s){
        
    }
}
