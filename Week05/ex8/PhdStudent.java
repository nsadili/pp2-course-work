package WEEK5.ex8;

public class PhdStudent extends Student{
    String department;
    String courses;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCourses() {
        return courses;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "PhdStudent [department=" + department + ", courses=" + courses + "]";
    }
    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department,
            String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }
    public void equals(PhdStudent pStud){

    }
    
}
