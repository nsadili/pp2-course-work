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
        return getFirstName() + " " +  getLastName() + "(" + getGender() + ")" + department +" " +  Arrays.toString(courses);
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

public class Student extends Inheritance
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

public class PhdStudent extends Student
{
    private int studentId;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses)
    {
        super(firstName, lastName, gender, studentId);
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

    public String toString()
    {
        return getFirstName() + " " +  getLastName() + "(" + getGender() + ")" + getStudentId() + " " + + department + " " + Arrays.toString(courses);
    }

    public boolean equals(PhdStudent pStud)
    {
        if (this == pStud) return true;
        if (!(pStud instanceof PhdStudent)) return false;
        if (!super.equals(pStud)) return false;

        PhdStudent phdStudent = (PhdStudent) pStud;
        return Objects.equals(department, phdStudent.department) && Arrays.equals(courses, phdStudent.courses);
    }

    public class Main 
    {
    public static void main(String[] args) 
    {
        
        Person person = new Person("Kamal", "Ismayilzade", "Male");
        System.out.println("Person: " + person);

        String[] courses = {"Pp1", "Pp2"};
        Teacher teacher = new Teacher("Nuraddin", "Sadili", "Male", "Programming", courses);
        System.out.println("Teacher: " + teacher);

        Student student = new Student("Sara", "Ismayilova", "Female", 16072);
        System.out.println("Student: " + student);

        String[] phdCourses = {"Biology", "Math"};
        PhdStudent phdStudent = new PhdStudent("name", "surname", "Male", 12345, "Computer Science", phdCourses);
        System.out.println("PhdStudent: " + phdStudent);

        System.out.println("person equals person: " + person.equals(person));
        System.out.println("person equals teacher: " + person.equals(teacher));
        System.out.println("teacher equals teacher: " + teacher.equals(teacher));
        System.out.println("teacher equals phdStudent: " + teacher.equals(phdStudent));
        System.out.println("student equals student: " + student.equals(student));
        System.out.println("student equals phdStudent: " + student.equals(phdStudent));
        System.out.println("phdStudent equals phdStudent: " + phdStudent.equals(phdStudent));
    }
}



     


}    