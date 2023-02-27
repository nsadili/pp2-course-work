package Week05.Person;

public class PhdStudent extends Student {
    String department;
    String courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }


    public void setCourses(String courses) {
        this.courses = courses;
    }
    public String getCourses() {
        return courses;
    }


    public String toString() {
        return "PhdStudent's ID: " + getStudentId()
        + "\nPhd Student's department: " + getDepartment() 
        + "\nPhd Student's courses: " + getCourses()
        + "\nPhd Student's firstname: " + getFirstName()
        + "\nPhd Student's lastname: " + getLastName()
        + "\nPhd Student's gender: " + getGender();
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud)
        && this.department == pStud.getDepartment()
        && this.courses == pStud.getCourses();
    }
}