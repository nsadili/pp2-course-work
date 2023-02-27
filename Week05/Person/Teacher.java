package Week05.Person;

public class Teacher extends Person {
    String department;
    String courses;

    public Teacher(String firstName, String lastName, String gender, String department, String courses){
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    public void setCourses(String courses){
        this.courses = courses;
    }
    public String getCourses(){
        return courses;
    }

    public String toString(){
        return "Teacher's department: " + getDepartment() 
        + "\nTeacher's courses: " + getCourses()
        + "\nTeacher's firstname: " + getFirstName()
        + "\nTeacher's lastname: " + getLastName()
        + "\nTeacher's gender: " + getGender();
    }

    public boolean equals(Teacher t){
        return this.department.equals(t.getDepartment())
        && this.courses.equals(t.getCourses());
    }
}
