package week05coursework;

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
    
    @Override
    public String toString() {
        return super.toString() + ", " + studentId;
    }
    
    public boolean equals(Student s) {
        return super.equals(s) && this.studentId == s.studentId;
    }
}

