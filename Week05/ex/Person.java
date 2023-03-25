import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Person: " + firstName + " " + lastName + " (" + gender + ")";
    }

    public boolean equals(Person p) {
        return (this.firstName.equals(p.getFirstName()) && this.lastName.equals(p.getLastName())
                && this.gender.equals(p.getGender()));
    }
}

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

    public String toString() {
        return super.toString() + ", Teacher (Dept: " + department + ", Courses: " + Arrays.toString(courses) + ")";
    }

    public boolean equals(Teacher t) {
        return (super.equals(t) && this.department.equals(t.getDepartment())
                && Arrays.equals(this.courses, t.getCourses()));
    }
}

public class Student extends Person {
    private int studentId;

    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return super.toString() + ", Student (ID: " + studentId + ")";
    }

    public boolean equals(Student s) {
        return (super.equals(s) && this.studentId == s.getStudentId());
    }
}

public class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
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
        return super.toString() + ", PhdStudent (Dept: " + department + ", Courses: " + Arrays.toString(courses) + ")";
    }

    public boolean equals(PhdStudent pStud) {
        return (super.equals(pStud) && this.department.equals(pStud.getDepartment())
                && Arrays.equals(this.courses, pStud
