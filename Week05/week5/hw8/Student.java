package pp2.week5.hw8;

public class Student extends Person {
    private int studentId;
    
    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
    
    public boolean equals(Student s) {
        return super.equals(s) && studentId == s.getStudentId();
    }
}