package inheritance;

public class Student extends Person {

    public Student(String firstName, String lastName, String gender, String StudentID) {
        super(firstName, lastName, gender);
        if (StudentID.length()!=5) {
            System.out.println("Please provide a valid Student ID number!");
            System.exit(0);
        }
        this.StudentID=StudentID;
    }

    private String StudentID;

    
    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String toString(){
        // return getFirstName() + " " + getLastName() + "\nGender: " + getGender() 
        // +"\nStudent ID: " + this.StudentID;
        return super.toString() +"\nStudent ID: " + this.StudentID;
    }

    public boolean equals(Student s){
        if ((s.getFirstName()==getFirstName()) && (s.getLastName()==getLastName()) && (s.getGender()==getGender())
         && (s.getStudentID()==getStudentID())) return true;
        else return false;
    }





    

    
}
