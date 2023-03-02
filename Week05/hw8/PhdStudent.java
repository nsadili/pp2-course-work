public class PhdStudent extends Student {
    private final String department;
    private final String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses.clone();
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses.clone();
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + Arrays.toString(courses);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PhdStudent)) {
            return false;
        }
        PhdStudent pStud = (PhdStudent) obj;
        return super.equals(pStud) && department.equals(pStud.getDepartment()) && Arrays.equals(courses, pStud.getCourses());
    }
}
