package InheritanceEx8;

import java.util.Objects;

public class Teacher extends Person{

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

    public void setDepartment() {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses() {
        this.courses = courses;
    }

    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + courses; 

    }

    public boolean equals(Teacher t) {
        if (t == null) {
            return false;
        }
        return super.equals(t) && Objects.equals(department, t.department) && 
        Objects.equals(courses, t.courses);

    }
    
}
