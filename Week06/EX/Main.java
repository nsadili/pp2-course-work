public class Main {
    public static void main(String[] args) {

    }
}

class Person {
    private String firstName, lastName, gender;

    public Person() {

    }

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
        return "first name = " + firstName + "\n last name: " + lastName + "\n gender: " + gender;
    }

    public boolean equals(Person p) {
        return firstName.equals(p.getFirstName()) && lastName.equals(p.getLastName()) && gender.equals(p.getGender());
    }
}

class Student extends Person {
    private long studentId;

    public Student() {
    }

    public Student(String firstName, String lastName, String gender, long studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public boolean equals(Student s) {
        return studentId == s.getStudentId() &&
                super.getFirstName().equals(s.getFirstName()) &&
                super.getLastName().equals(s.getLastName()) &&
                super.getGender().equals(s.getGender());
    }

    public String toString() {
        return super.toString() + "\n student ID: " + studentId;
    }
}

class Teacher extends Person {
    private String department, courses;

    public Teacher() {

    }

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
        return super.toString() + "\n department: " + department + "\n courses: " + courses;
    }

    public boolean equals(Teacher t) {
        return department.equals(t.getDepartment()) && courses.equals(t.getCourses()) &&
                super.getFirstName().equals(t.getFirstName()) &&
                super.getLastName().equals(t.getLastName()) &&
                super.getGender().equals(t.getGender());
    }
}

class PHDStudent extends Student {
    private String department, courses;

    public PHDStudent(String firstName, String lastName, String gender, long studentId, String department, String courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public PHDStudent() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
