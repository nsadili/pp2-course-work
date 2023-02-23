package Week05.pw;

import java.util.Arrays;

public class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public Teacher(Teacher t) {
        this(t.getFirstName(), t.getLastName(), t.getGender(), t.getDepartment(), t.getCourses());
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public String toString() {
        return super.toString() + " (" + this.department + ")";
    }

    public boolean equals(Teacher t) {
        return super.equals(t) && this.department == t.getDepartment() && Arrays.equals(this.courses, t.getCourses());
    }
}
