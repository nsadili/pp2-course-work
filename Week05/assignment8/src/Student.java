public class Student extends Person {
    private String studentId;

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
        return "Student{" +
                "studentId='" + studentId + '\'' +
                "} " + super.toString();
    }

    public boolean equals(Student s) {
        return super.equals(s) && studentId.equals(s.studentId);
    }
}