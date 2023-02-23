package Week05.HW;

public class Student extends Person {
    private String studentId;

    public Student(String firstName, String lastName, String gender, String string) {
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
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    public boolean equals(Student s) {
        if (s == null) {
            return false;
        }
        return super.equals(s) && studentId == s.studentId;
    }
}
