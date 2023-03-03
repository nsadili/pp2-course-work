package exs;

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
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }

    public boolean equals(Student s) {
        if (s == null) {
            return false;
        }
        if (s.getClass() != getClass()) {
            return false;
        }
        Student student = (Student) s;
        return super.equals(s) &&
                studentId == student.studentId;
    }
}
