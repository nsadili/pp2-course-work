public class Student extends Person{
    private String studentID;
    public Student(String firstName, String lastName, String gender, String studentID) {
        super(firstName, lastName, gender);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String toString(){
        return super.toString()+" - StudentID: "+this.studentID;
    }

    public boolean equals(Student s){
        return super.equals(s) && this.studentID == s.studentID;
    }

}
