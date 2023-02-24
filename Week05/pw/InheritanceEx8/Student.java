package InheritanceEx8;

import java.util.Objects;

public class Student extends Person{
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
        return super.toString() + ", StudentId: " + studentId; 
    }

    public boolean equals(Student s) {
        if (s == null) {
            return false;
        }
        return super.equals(s) && Objects.equals(studentId, s.studentId);
    }
}
