public class Student extends Person {
    private int studentId;

    public Student(int studentId) {
        super("", "");
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }

    public boolean equals(Student s) {
        if (s == null || getClass() != s.getClass()) {
            return false;
        }
        return studentId == s.studentId;
    }
}









