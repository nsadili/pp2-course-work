package InheritancePW;

import java.util.Arrays;

public class StudentPHD extends Student {
    String department;
    String[] courses;
    public StudentPHD(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
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
        return "PhdStudent{" +
                "department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) +
                "} " + super.toString();
    }
    public boolean equals(StudentPHD pStud) {
        return super.equals(pStud) &&
                this.department.equals(pStud.getDepartment()) &&
                Arrays.equals(this.courses, pStud.getCourses());
    }
}