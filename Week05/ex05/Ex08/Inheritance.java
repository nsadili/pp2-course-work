package Ex08;
import java.util.Arrays;

class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(String name, int age) {
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
        return "Person" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", gender='" + gender + '\'';
    }
    public boolean equals(Person p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        return firstName.equals(p.firstName) && lastName.equals(p.lastName) && gender.equals(p.gender);
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
            return "Student: " + super.toString() + " (" + studentId + ")";
        }
    
        public boolean equals(Student s) {
            return super.equals(s) && studentId == s.getStudentId();
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
            return "PhdStudent: " + super.toString() + " (" + department + ")";
        }
    
        public boolean equals(PhdStudent pStud) {
            return super.equals(pStud) && department.equals(pStud.getDepartment()) && Arrays.equals(courses, pStud.getCourses());
        }
    }
    public String getAge() {
        return null;
    }
}

