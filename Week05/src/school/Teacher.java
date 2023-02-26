package school;

public class Teacher extends Person {
    private String department;
    private String courses;
    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
        super(firstName, lastName, gender);
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
    public boolean equals(Teacher t) {
        if(this.getFirstName()==t.getFirstName() && this.getLastName()==t.getLastName() && this.getGender()==t.getGender() && this.department==t.department && this.courses==t.courses) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Teacher [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", gender=" + getGender() + ", department=" + department + ", courses=" + courses + "]";
    }   
}
