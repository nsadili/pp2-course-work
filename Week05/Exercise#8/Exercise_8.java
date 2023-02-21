//first part of the code

public class Person {
    private String firstName;
    private String lastName;  
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

 
    public String toString() {
        return "Person's first name is" + this.firstName + "Person's surname is" + this.lastName + "Person's gender is" + this.Gender;
             
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender);
    }
}

//second part of the code

public class Teacher extends Person {
    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender, String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String toString() {
        return "First name:" + getFirstName() +"/" + "Last name:" + getLastName() + "/" + "Gender:" + getGender() + "/" + "Department:" + this.department + "/" + "Courses:" + this.courses; 

    }

    public boolean equals(Teacher t) {
        return super.equals(t) && this.department.equals(t.department) && this.courses.equals(this.courses, p.courses);
    }

}

//third part of the code

public class Student extends Person {
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

    public String toString() {
        return  "First name:" + getFirstName() +"/" + "Last name:" + getLastName() + "/" + "Gender:" + getGender() + "/" + "id:" + this.studentId; 
    }

    public boolean equals(Student s) {
        return super.equals(s) && this.studentId == p.studentId;
    }
}

//fourth part of the code

public class PhdStudent extends Student {
    private String department;
    private String courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    
    public String toString() {
        return "First name:" + getFirstName() +"/" + "Last name:" + getLastName() + "/" + "Gender:" + getGender() + "/" + "id:" + this.studentId + "Department:" + this.department + "/" + "Courses:" + this.courses; 

    }

    public boolean equals(Teacher t) {
        return super.equals(t) && this.department.equals(p.department) && this.courses.equals(this.courses, p.courses);
    }

    public class Main {
        public static void main(String[] args) {
            Person person = new Person("Ramil", "Farid", "Murad");
            System.out.println("Person: " + person.toString());
    
            Teacher teacher = new Teacher("Masha", "Bagirova", "Female", "Calculus", "Algebra");
            System.out.println("Teacher: " + teacher.toString());
    
            Student student = new Student("David", "Matteus", "Male", 4657);
            System.out.println("Student: " + student.toString());
    
            PhdStudent phdStudent = new PhdStudent("Irina", "Lee", "Female", 5673, "Computer Science", new String[]{"Algorithms", "Data Structures"});
            System.out.println("PhdStudent: " + phdStudent.toString());
    
            System.out.println("person.equals(person): " + person.equals(person));
            System.out.println("person.equals(teacher): " + person.equals(teacher));
            System.out.println("teacher.equals(new Teacher(\"Masha\", \"Bagirova\", \"Female\", \"Calculus\", \"Algebra\")): " + teacher.equals(new Teacher("Jane", "Smith", "Female", "Math", "Algebra"))); // true
            System.out.println("student.equals(new Student(\"David\", \"Matteus\", \"Male\", 4657)): " + student.equals(new Student("Bob", "Johnson", "Male", 123456))); // true
            System.out.println("phdStudent.equals(new PhdStudent(\"Irina\", \"Lee\", \"Female\", 5673, \"Computer Science\", new String[]{\"Algorithms\", \"Data Structures\"})): " + phdStudent.equals(new PhdStudent("Irina", "Lee", "Female", 789012, "Computer Science", new String[]{"Algorithms", "Data Structures"}))); // true
        }

}
}
