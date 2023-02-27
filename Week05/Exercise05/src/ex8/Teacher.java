package ex8;

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
        return "Teacher [department=" + department + ", courses=" + courses + "]";
    }
    
    public boolean equals(Teacher t) {
        Person p1 = new Person(t.getFirstName(), t.getLastName(), t.getGender());
        Person p2 = new Person(this.getFirstName(), this.getLastName(), this.getGender());

        if (p1.equals(p2))
            if (t.department == this.department && t.courses == this.courses)
                return true;

        return false;
    }
}
