public class Inheritance{
    public class Person{
        private String firstName;
        private String lastName;
        private String gender;
    public Person(String firstName, String lastName, String gender){
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
    public String toString(){
        return  firstName + " " + lastName + " " + gender;
    }
    public boolean equals(Person a){
        return this.firstName.equals(a.getFirstName()) && this.lastName.equals(a.getLastName()) &&
        this.gender.equals(a.getGender());
    }
    }
    public class Teacher extends Person{
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
        public String toString(){
            return super.toString() + " " + department + " " + courses;
        }
        public boolean equals(Teacher t) {
            return super.equals(t) && this.department.equals(t.getDepartment()) && this.courses.equals(t.getCourses());
        }
    }

    public class Student extends Person{
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
            return super.toString() + " " + studentId;
        }
    
        public boolean equals(Student b) {
            return super.equals(b) && this.studentId == b.getStudentId();
        }
    }
    public class PhdStudent extends Student {
    private String department;
    private String courses;
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

    public String toString(){
        return super.toString() + " " + department + " " + courses;
    }
     public boolean equals(PhdStudent c){
        return super.equals(c) && this.department.equals(c.getDepartment()) &&  this.courses.equals(c.getCourses());
     }

    }
}