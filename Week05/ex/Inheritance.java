public class Inheritance {
    public static void main(String[] args) {
        
        Person p1 = new Person("Ilgar", "Qarayev", "Male");
        Person p2 = new Person("Sevinc", "Mammadov", "Female");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));

        Teacher t1 = new Teacher("Leyla", "Qurbanova", "Female", "Math", "Algebra");
        Teacher t2 = new Teacher("Rashad", "Ramazanov", "Male", "IT", "PP2");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.equals(t2));

        Student s1 = new Student("Murad", "Aliyev", "Male", 14949);
        Student s2 = new Student("Vugar", "Sadiqov", "Male", 19494);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));

        PhdStudent ps1 = new PhdStudent("Samad", "Samadov", "Male", 14494, "IT", "PP1");
        PhdStudent ps2 = new PhdStudent("Elshan", "Orucov", "Male", 19949, "Math", "Calculus");

        System.out.println(ps1.toString());
        System.out.println(ps2.toString());
        System.out.println(ps1.equals(ps2));
    }
}


    class Person {

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
        return "Person FirstName: " + firstName + ", Person LastName: " + lastName + ", Person Gender: " + gender;
    }

    public boolean equals(Person p) {
        return (this.firstName == p.firstName && this.lastName == p.firstName && this.gender == p.gender);
    }

}

    
    class Teacher extends Person {

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

    public void setDepartment(String deparment) {
        this.department = deparment;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + courses;
    }

    public boolean equals(Teacher t) {
        return (super.equals(t) && this.department == t.department && this.courses == t.courses);
    }

}


    class Student extends Person {

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
        return super.toString() + ", Student Id: " + studentId;
    }

    public boolean equals(Student s) {
        return (super.equals(s) && this.studentId == s.studentId);
    }

}


    class PhdStudent extends Student {

        private String department;
        private  String courses;

        public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String courses) {
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

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + courses;
    }

    public boolean equals(PhdStudent pStud) {
        return (super.equals(pStud) && this.department == pStud.department && this.courses == pStud.courses);
    }
}

