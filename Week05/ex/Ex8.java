package Week05.ex;
import java.util.Arrays;

public class Ex8 {
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
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    
        public boolean equals(Person p) {
            return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName)
                    && this.gender.equals(p.gender);
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
    
        @Override
        public String toString() {
            return "Teacher{" +
                    "department='" + department + '\'' +
                    ", courses=" + Arrays.toString(courses) +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", gender='" + getGender() + '\'' +
                    '}';
        }
    
        public boolean equals(Teacher t) {
            return super.equals(t) && this.department.equals(t.department) && Arrays.equals(this.courses, t.courses);
        }
    }
    
    public class Student extends Person {
        private String studentId;
    
        public Student(String firstName, String lastName, String gender, String studentId) {
            super(firstName, lastName, gender);
            this.studentId = studentId;
        }
    
        public String getStudentId() {
            return studentId;
        }
    
        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
    
        
        public String toString() {
            return "Student{" +
                    "studentId='" + studentId + '\'' +
                    ", firstName='" + getFirstName() + '\'' +
                    ", lastName='" + getLastName() + '\'' +
                    ", gender='" + getGender() + '\'' +
                    '}';
        }
    
        public boolean equals(Student s) {
            return super.equals(s) && this.studentId.equals(s.studentId);
        }
    }
    
    public class PhdStudent extends Student {
        private String department;
        private String[] courses;
    
        public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, String[] courses) {
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
            return this.Arrays.toString(this.courses);
}
    }
}