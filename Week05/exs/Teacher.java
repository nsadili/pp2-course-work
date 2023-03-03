package exs;

public class Teacher extends Person {
    private String department;
    private List<String> courses;

    public Teacher(String firstName, String lastName, String gender, String department, List<String> courses) {
        super(firstName, lastName, gender);
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

    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }

    public boolean equals(Teacher t) {
        if (t == null) {
            return false;
        }
        if (t.getClass() != getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) t;
        return super.equals(t) &&
                Objects.equals(department, teacher.department) &&
                Objects.equals(courses, teacher.courses);
    }
}
