public class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(int student, String department, String[] courses) {
        super(student); 
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
        return "PhdStudent{" +
                "student=" + getStudentId() +
                ", department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) return false;
        if (getClass() != pStud.getClass()) return false;
        if (!super.equals(pStud)) return false;
        if (!department.equals(pStud.department)) return false;
        return Arrays.equals(courses, pStud.courses);
    }
}
-++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++-