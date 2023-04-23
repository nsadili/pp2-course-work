import java.io.Serializable;

public class Student implements Serializable{
    String firstName;
    String LastName;
    Double gpa;

    public Student(String firstName, String lastName, Double gpa) {
        this.firstName = firstName;
        LastName = lastName;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", LastName=" + LastName + ", gpa=" + gpa + "]";
    }
}
