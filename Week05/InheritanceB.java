import java.util.Objects;

public class InheritanceB {
    public class Teacher extends Person{
        private String department;
    private String courses;

    public Teacher( String department, String courses) {
        
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

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + courses.toString();
    }

    public boolean equals(Teacher t) {
        if (this == t) {
            return true;
        }
        if (t == null || getClass() != t.getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) t;
        return super.equals(t) &&
               Objects.equals(department, teacher.department) &&
               Objects.equals(courses, teacher.courses);
    }
}
}