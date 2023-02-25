package Week05.PW;

public class Student extends Person {
    private String studentId;

    public Student(String firstName, String lastName, String gender, String string) {
        super(firstName, lastName, gender);
        this.studentId = string;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                "} " + super.toString();
    }

    public boolean equals(Student s) {
        return super.equals(s) && this.studentId == s.studentId;
    }
}
