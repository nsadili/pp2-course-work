import java.util.Arrays;
import java.util.List;

public class Inheritance {



    
        public static void main(String[] args) {
    
            // create a Teacher
    
            Teacher teacher = new Teacher("John", "Doe", "Male", "Math", new String[]{"Algebra", "Geometry"});
    
            System.out.println(teacher);
    
    
    
            // create a Student
    
            Student student = new Student("Jane", "Doe", "Female", 123456);
    
            System.out.println(student);
    
    
    
            // create a PhdStudent
            String[] courses = {"Quantum Mechanics", "General Relativity"};
            PhdStudent phdStudent = new PhdStudent("Bob", "Smith", "Male", 654321, "Physics", courses);
    
            System.out.println(phdStudent);
    
    
    
            // test equals() methods
    
            Student student2 = new Student("Jane", "Doe", "Female", 123456);
    
            System.out.println("student.equals(student2): " + student.equals(student2));
    
            String[] courses1 = {"Quantum Mechanics", "General Relativity"};
    
            PhdStudent phdStudent2 = new PhdStudent("Bob", "Smith", "Male", 654321, "Physics", courses1);
    
            System.out.println("phdStudent.equals(phdStudent2): " + phdStudent.equals(phdStudent2));
    
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
            return firstName + " " + lastName + " (" + gender + ")";
        }
        
        public boolean equals(Person p) {
            return this.firstName.equals(p.getFirstName()) && this.lastName.equals(p.getLastName()) && this.gender.equals(p.getGender());
        }
    }
    
    class Teacher extends Person {
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
            return super.toString() + ", " + department + " department, teaching " + Arrays.toString(courses);
        }
        
        public boolean equals(Teacher t) {
            return super.equals(t) && this.department.equals(t.getDepartment()) && Arrays.equals(this.courses, t.getCourses());
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
            return super.toString() + ", student ID: " + studentId;
        }
        
        public boolean equals(Student s) {
            return super.equals(s) && this.studentId == s.getStudentId();
        }
    }
    
    class PhdStudent extends Student {
        private String department;
        private String[] courses;
        
        public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] list) {
            super(firstName, lastName, gender, studentId);
            this.department = department;
            this.courses = list;
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
            return super.toString() + ", " + department + " department, taking " + Arrays.toString(courses) + " courses";
        }
        
        public boolean equals(PhdStudent pStud) {
            return super.equals(pStud) && this.department.equals(pStud.getDepartment()) && Arrays.equals(this.courses, pStud.courses);
        }
    }

