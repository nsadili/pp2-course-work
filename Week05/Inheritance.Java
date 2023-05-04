// Person class
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName) &&
                this.lastName.equals(p.lastName) &&
                this.gender.equals(p.gender);
    }
}

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
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + courses +
                '}';
    }

    public boolean equals(Teacher t) {
        return super.equals(t) &&
                this.department.equals(t.department) &&
                this.courses.equals(t.courses);
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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    public boolean equals(Student s) {
        return super.equals(s) && this.studentId == s.studentId;
    }
}

public class PhdStudent extends Student {
    private String department;
    private List<String> courses;
}

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, List<String> courses) {
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
