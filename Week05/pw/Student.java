package Week05.pw;

public class Student extends Person {
    private int studentId;

    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public Student(Student s) {
        this(s.getFirstName(), s.getLastName(), s.getGender(), s.getStudentId());
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String toString() {
        return super.toString() + " (" + this.studentId + ")";
    }

    public boolean equals(Student s) {
        return super.equals(s) && this.studentId == s.getStudentId();
    }
}
