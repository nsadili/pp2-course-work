public class Teacher {
    private String department;
    private List<String> courses;

    public Teacher(String department, List<String> courses) {
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }

    public boolean equals(Teacher t) {
        if (t == null || getClass() != t.getClass()) {
            return false;
        }
        if (!Objects.equals(department, t.department)) {
            return false;
        }
        return Objects.equals(courses, t.courses);
    }
}
















