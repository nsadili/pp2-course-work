package Week05.src;

import java.util.*;

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

    @Override
    public String toString() {
        return "PhdStudent{" + "department='" + department + '\'' + ", courses=" + Arrays.toString(courses) + "} " + super.toString();
    }

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) {
            return false;
        }
        return super.equals(pStud) && department.equals(pStud.department) && Arrays.equals(courses, pStud.courses);
    }
}