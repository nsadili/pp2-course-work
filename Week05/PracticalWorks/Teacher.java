package Week05.PracticalWorks;

import java.util.Arrays;

public class Teacher extends Person {
    String department;
    String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public boolean equals(Teacher t) {
        return super.equals(t) &&
                this.department.equals(t.getDepartment()) &&
                Arrays.equals(this.courses, t.getCourses());
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
        return "Teacher/" + "department='" + department + '\'' + ", courses=" + Arrays.toString(courses) + "} " + super.toString();
    }


}
