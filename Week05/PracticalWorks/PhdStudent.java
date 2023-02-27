package Week05.PracticalWorks;

import java.util.Arrays;

public class PhdStudent extends Student {
    String department;
    String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) &&
                this.department.equals(pStud.getDepartment()) &&
                Arrays.equals(this.courses, pStud.getCourses());
    }

    public String toString() {
        return "PhdStudent{" + "department='" + department + '\'' + ", courses=" + Arrays.toString(courses) + "} " + super.toString();
    }
}

