package Week05;

import java.util.Arrays;

public class PhdStudent extends Student {
    String department;
    String[] courses;

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
        return "PhdStudent department is " + department + ", courses is " + Arrays.toString(courses) + ", studentId is " + getStudentId() + ", firstName is " + getFirstName() + ", lastName is " + getLastName() + ", gender is " + getGender() + ".";
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) &&
                this.department.equals(pStud.getDepartment()) &&
                Arrays.equals(this.courses, pStud.getCourses());
    }
}
