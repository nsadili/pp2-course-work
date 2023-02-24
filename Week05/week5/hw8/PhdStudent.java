package pp2.week5.hw8;

import java.util.Arrays;

public class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
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

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) && department.equals(pStud.getDepartment()) && Arrays.equals(courses, pStud.getCourses());
    }
}