public class PhdStudent extends Student{
    private String department;
    private String courses;

    public PhdStudent(String firstName, String lastName, String gender, String studentID, String department, String courses){
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

    @Override
    public String toString(){
        return super.toString() + " Department: " + this.department + " Courses: " + this.courses;
    }

    public boolean equals(PhdStudent p){
        if(p == null){
            return false;
        }else{
            return super.equals(p) && department.equals(this.department) && courses.equals(this.courses);
        }
    }

}