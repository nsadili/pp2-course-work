package Week05.Inheritance;

import java.util.List;
import java.util.Objects;

class Person {
    private  String firstName;
    private  String lastName;
    private  char[] gender = {'m', 'f'};
    public Person(String firstName, String lastName, String gender2){
    }
    
    //public Person(String firstName2, String lastName2, char[] gender2, String department, List<String> courses) {
    //}

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public char[] getgender(){
        return gender;
    }
    public void setgennder(char[] gender){
        this.gender = gender;
    }
    public static String toString(String firstName,String lastName, char[] gender){
        String full = firstName + " " + lastName + " gender: " +  gender; 
        return full;
    }
public  boolean equals(Person p){

    if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Person person = (Person) p;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(gender, person.gender);

}


 class Teacher extends Person{
    
    private String department;
    private List<String> courses;
    public Teacher(String firstName, String lastName, String gender, String department, List<String> courses ){
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    public String getDepartment(){
        return department;
    }
    public List<String> getCourses(){
        return courses;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setCourses(List<String> courses){
        this.courses = courses;
    }
    public String toString(){
        return "Teacher{"+ "firstName "+ getFirstName() + "; lastName: " + getlastName() + "; gender: " + getgender() + "; department: " + getDepartment() + "; courses: " + getCourses() + " }" ; 
    }
    public boolean equals(Teacher t){
        if (this == t) return true;
        if(t == null || getClass() != t.getClass() ) return false;
        Person person = (Person) t;
        return Objects.equals(firstName, person.firstName) && 
        Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender);
        
    }
 }
    class Student extends Person{
        public int studentID;
        public Student(String firstName, String lastName, String gender, String studentId){
            super(firstName, lastName, gender);
            this.studentID = studentID; 
        }
        public void setStudentID(int studentID){
            this.studentID = studentID ; 
        }
        public int getStudentID(){
            return studentID;
        }
        public String toString(){
            return "Student{ "+ "name: "+ getFirstName() + getlastName() + " gender: " + getgender()+  " stundentID: " + getStudentID() + " } ";
        }
        public boolean equals(Student s){
            if (this == s) return true;
            if (s == null || getClass() != s.getClass() ) return false;
            if (!super.equals(s) ) return false;
            Student student = (Student) s;
            return Objects.equals(studentID, s.studentID);


        }
    }
    class PhdStudent extends Student{
        String department;
        List<String> courses;
        public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, List<String> courses){
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
        public List<String> getCourses() {
            return courses;
        }
        public void setCourses(List<String> courses) {
            this.courses = courses;
        }
        public String toString(PhdStudent pStud){
            return "PhdStudent{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getlastName() + '\'' +
                ", gender='" + getgender() + '\'' +
                ", studentId='" + getStudentID() + '\'' +
                ", department='" + department + '\'' +
                ", courses=" + courses +
                '}'; 
        }
                public boolean equals(PhdStudent pStud){
                    if (this == pStud) return true;
                    if (pStud == null || getClass() != pStud.getClass()) return false;
                    if (!super.equals(pStud)) return false;
                    PhdStudent phdStudent = (PhdStudent) pStud;
                    return Objects.equals(department, phdStudent.department) &&
                            Objects.equals(courses, phdStudent.courses);
                }
            
        
        
        }
        class PhdStudent extends Student{
            String departmenn;
            List<String> courses;
            public Students(String firstName, String lastName, String gender, String studentId, String department, List<String> courses ){
                super(firstName, lastName, gender, studentID);
                this.department = department;
                this.courses = courses;

            
            }
            public void setDepartment(String department){
                this.department = department; 
            }
            public String getDepartment(){
                return department;
            }
            public List<String> getCourses(){
                return courses;
            }
            public String toString(PhdStudent pStud){
            return "PhdStudent{" +
            "firstName='" + getFirstName() + '\'' +
            ", lastName='" + getlastName() + '\'' +
            ", gender='" + getgender() + '\'' +
            ", studentId='" + getStudentID() + '\'' +
            ", department='" + department + '\'' +
            ", courses=" + courses +
            '}';}
            public boolean equals(PhdStudent pStud){
                if (this == pStud) return true;
                if (pStud == null || getClass() != pStud.getClass() ) return false;
                if (!super.equals(pStud) ) return false;
                PhdStudent phdStudent = (PhdStudent) pStud;
                return Objects.equals(department, phdStudent.department) &&
                Objects.equals(courses, phdStudent.courses);

            }

        }
        
    }

 



