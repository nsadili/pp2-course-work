package pp2.week5.hw8;

import java.util.Arrays;

public class Teacher extends Person {
    private String department;
    private String[] courses;
    
    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String[] getCourses() {
        return courses;
    }
    
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    
    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + Arrays.toString(courses);
    }
    
    public boolean equals(Teacher t) {
        return super.equals(t) && department.equals(t.getDepartment()) && Arrays.equals(courses, t.getCourses());
    }
}