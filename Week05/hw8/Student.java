public class Student extends Person {
    private final int studentId;
    
    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        return super.equals(s) && studentId == s.getStudentId();
    }
}
