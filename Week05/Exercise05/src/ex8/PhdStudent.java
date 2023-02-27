package ex8;

public class PhdStudent extends Student {
    private String department;
    private String courses;
    
    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department,
            String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public String getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "PhdStudent [department=" + department + ", courses=" + courses + "]";
    }

    public boolean equals(PhdStudent pStud) {
        Student s1 = new Student(pStud.getFirstName(), pStud.getLastName(), pStud.getGender(), pStud.getStudentId());
        Student s2 = new Student(this.getFirstName(), this.getLastName(), this.getGender(), this.getStudentId());

        if (s1.equals(s2))
            if (pStud.department == this.department && pStud.courses  == this.courses)
                return true;

        return false;
    }
}
