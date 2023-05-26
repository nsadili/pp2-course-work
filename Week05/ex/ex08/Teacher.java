package ex08;


public class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
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

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String toString() {
        return super.toString() + ", " + department + ", " + courses;
    }

    public boolean equals(Teacher t) {
        return super.equals(t) && this.department.equals(t.getDepartment())
                && this.courses.equals(t.getCourses());
    }
}
