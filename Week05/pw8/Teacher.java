package Week05.pw8;

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

    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public boolean equals(Teacher t) {
        return super.equals(t) && this.department == t.department && Arrays.equals(this.courses, t.courses);
    }
}
