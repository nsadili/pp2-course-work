public class Student extends Person{
    private String studentID;

    public Student(String firstName, String lastName, String gender, String studentID){
        super(firstName, lastName, gender);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString(){
        return super.toString() + " studentID :" + this.studentID;
    }

    public boolean equals(Student s){
        if(s == null){
            return false;
        }else{
            return super.equals(s) && studentID.equals(this.studentID);
        }
    }
}
