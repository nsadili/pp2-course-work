public class PhdStudent extends Student{
    private String department, courses;
    public PhdStudent(String firstName, String lastName, String gender, String studentID, String department, String courses) {
        super(firstName, lastName, gender, studentID);
        this.department = department;
        this.courses = courses;
    }

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

    public String toString(){
        return super.toString()+" - Department: "+this.department+" - Courses: "+this.courses;
    }

    public boolean equals(PhdStudent pStud){
        return super.equals(pStud) && this.department==pStud.department && this.courses==pStud.courses;
    }
}
