package WEEK5.ex8;

public class Teacher extends Person{
    String department;
    String courses;
    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
        
    }
    @Override
    public String toString() {
        return "Teacher [department=" + department + ", courses=" + courses + "]";
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
    public void equals(Teacher t){
        
    }
    
}