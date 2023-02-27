package Week05.Person;

public class Student extends Person{

    int studentId;

    public Student(String firstName, String lastName, String gender, int studentId){
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public int getStudentId(){
        return studentId;
    }

    public String toString(){
        return "Student's ID: " + getStudentId()
        + "\nStudent's firstname: " + getFirstName()
        + "\nStudent's lastname: " + getLastName()
        + "\nStudent's gender: " + getGender();
    }
    
    public boolean equals(Student s){
        return super.equals(s)
        && this.studentId == s.getStudentId();
    }
}
