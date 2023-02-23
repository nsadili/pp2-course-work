package Week05.HW;

public class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
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

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }

    public boolean equals(Teacher t) {
        if (t == null) {
            return false;
        }
        return super.equals(t) &&
                department.equals(t.department) &&
                courses.equals(t.courses);
    }
}

