package school;

public class PhdStudent extends Student{
    private String department;
    private String courses;
    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }
    public String getDepartment() {
        return department;
    }
    public String getCourses() {
        return courses;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }

    public boolean equals(PhdStudent p) {
        if(this.getFirstName()==p.getFirstName() && this.getLastName()==p.getLastName() && this.getGender()==p.getGender() && this.getStudentId()==p.getStudentId() && this.department==p.department && this.courses==p.courses) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "PhdStudent [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() + ", department=" + department + ", courses=" + courses + "]";
    }
}
