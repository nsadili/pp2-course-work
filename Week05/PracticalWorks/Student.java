package Week05.PracticalWorks;

public class Student extends Person {
    private int studentId;

    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public boolean equals(Student s) {
        return super.equals(s) &&
                this.studentId == s.getStudentId();
    }

    public String toString() {
        return "Student{" + "studentId=" + studentId + "} " + super.toString();
    }

}
