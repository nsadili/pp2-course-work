package ex8;

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
        return "Student [studentId=" + studentId + "]";
    }

    public boolean equals(Student s) {
        Person p1 = new Person(s.getFirstName(), s.getLastName(), s.getGender());
        Person p2 = new Person(this.getFirstName(), this.getLastName(), this.getGender());

        if (p1.equals(p2))
            if(s.studentId == this.studentId)
                return true;

        return false;
    }
}
