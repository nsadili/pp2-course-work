public class Student extends Person {
    int studentId;

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
    
    public String toString(){
        return "Full name: "+ super.firstName+" Gender: "+super.gender+
        " ID: "+studentId;
    }
    public boolean equals(Student s){
        if(s.studentId==this.studentId) return true;
        else return false;
    }
}
