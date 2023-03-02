package Week05.EX.Ex08;

import java.util.Arrays;

public class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, String string, String[] string2, String strings) {
        super(firstName, lastName, gender, string);
        this.department = strings;
        this.courses = string2;
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
}

   

