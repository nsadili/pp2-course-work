import java.util.Arrays;

public class Inheritance
{
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName()
    {
        return firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

     public String getLastName()
    {
        return lastName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

     public String getGender()
    {
        return gender;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String toString()
    {
        return firstName + " " + lastName + "(" + gender + ")";
    }

    public boolean equals(Person p)
    {
        if(p == null)
        return false;

        return firstName.equals(p.firstName) && lastName.equals(p.lastName) && gender.equals(p.gender);
    }
}

public class Teacher extends Inheritance
{
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) 
    {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String[] getCourses()
    {
        return courses;
    }

    public void setCourses(String[] courses)
    {
        this.courses = courses;
    }

    public String toString() //string represantation
    {
        return getFirstName() + " " +  getLastName() + "(" + getGender() + ")" + department + Arrays.toString(courses);
    }

    // String.format - returns the formatted string  (%s %s\n)

    public boolean equals(Teacher t)
    { 
        if (this == t) return true;
        if (!(t instanceof Teacher)) return false;
        if (!super.equals(t)) return false;

        Teacher teacher = (Teacher) t;
        return Objects.equals(department, teacher.department) && Arrays.equals(courses, teacher.courses);
    }
}

public class Student extends Person
{
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

    public String toString()
    {
        return getFirstName() + " " +  getLastName() + "(" + getGender() + ")" + studentId;
    }

    public boolean equals(Student s)
    {
        if (this == s) return true;
        if (!(s instanceof Student)) return false;
        if (!super.equals(s)) return false;

        Student student = (Student) s;
        return Objects.equals(studentId, student.studentId);
    }




}    