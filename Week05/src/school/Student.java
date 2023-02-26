package school;

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

    public boolean equals(Student s) {
        if(this.getFirstName()==s.getFirstName() && this.getLastName()==s.getLastName() && this.getGender()==s.getGender() && this.studentId==s.studentId) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() + ", studentId=" + studentId + "]";
    }
}
