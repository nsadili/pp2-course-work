package Week05;

public class Student extends Person{
   private String studentId;
   private Person person;
    public Student(String studentId,Person person){
        super(person.getFirstName(), person.getLastName(), person.getGender());

        this.studentId=studentId;
        this.person=person;
        
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public String toString(){
        return "Student's ID: "+this.studentId;
    }
    public boolean equals(Student s){
        return this.studentId.equals(s.getStudentId());
    }
}
