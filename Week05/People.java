class Person {
    private String firstName;
    private String lastName;
    private char gender;

    public Person(String fName,String lName,char gen) {
        this.firstName=fName;
        this.lastName=lName;
        this.gender=gen;
    }

    public String GetfName() {
        return firstName;
    }

    public void setfName(String fName) {
        firstName=fName;
    }

    public String GetlName() {
        return lastName;
    }

    public void setlName(String lName) {
        this.lastName=lName;
    }

    public char GetGen() {
        return gender;
    }

    public void setGen(char gen) {
        gender=gen;
    }

    public String toString() {
        String full;

        full="Name: "+this.firstName+" Surname: "+this.lastName+" Gender: "+this.gender;
        return full;
    }

    public boolean equals(Person p) {
        if(p.firstName==this.firstName && p.lastName==this.lastName && p.gender==this.gender) return true;
        else return false;
    }
}

class Teacher extends Person {
    private String department;
    private String course;

    public Teacher(String name,String sur, char gen, String department,String course) {
        super(name, sur, gen);
        this.course=course;
        this.department=department;
    }

    public String GetCourse() {
        return this.course;
    }

    public void SetCourse(String course) {
        this.course=course;
    }

    public String GetDepartment() {
        return this.department;
    }

    public void SetDepartment(String department) {
        this.department=department;
    }

    public String toString() {
        String full;

        full="Name: "+super.GetfName()+" Surname: "+super.GetlName()+" Gender: "+super.GetGen()+" Department: "+this.department+" Course: "+this.course;
        return full;
    }

    public boolean equals(Teacher t) {
        if(super.equals(t) && t.course==this.course && t.department==this.department) return true;
        else return false;
    }

}

class Student extends Person{
    private String studentID;

    public Student(String name,String sur, char gen,String id) {
        super(name, sur, gen);
        this.studentID=id;
    }

    public String GetID() {
        return this.studentID;
    }

    public void SetID(String id) {
        this.studentID=id;
    }

    public String toString() {
        String full;

        full="Name: "+super.GetfName()+" Surname: "+super.GetlName()+" Gender: "+super.GetGen()+" ID: "+this.studentID;
        return full;
    }

    public boolean equals(Student s) {
        if(super.equals(s) && s.studentID==this.studentID) return true;
        else return false;
    }
}


class PhdStudent extends Student {
    private String department;
    private String course;

    public PhdStudent(String name,String sur, char gen,String id,String department, String course) {
        super(name, sur, gen, id);
        this.course=course;
        this.department=department;
    }

    public String GetCourse() {
        return this.course;
    }

    public void SetCourse(String course) {
        this.course=course;
    }

    public String GetDepartment() {
        return this.department;
    }

    public void SetDepartment(String department) {
        this.department=department;
    }

    public String toString() {
        String full;

        full="Name: "+super.GetfName()+" Surname: "+super.GetlName()+" Gender: "+super.GetGen()+" ID: "+super.GetID()+" Department: "+this.department+" Course: "+this.course;
        return full;
    }

    public boolean equals(PhdStudent pStud) {
        if(super.equals(pStud) && this.course==pStud.course && this.department==pStud.department) return true;
        else return false;
    }
}
public class People {
    public static void main(String[] args) {
        Person p1=new Person("Ali","Mahmudov",'m');
        Person p2=new Person("Ali","Mahmudov",'m');
        Teacher t1=new Teacher("Ali","Mahmudov",'m',"SITE","PP2");
        Teacher t2=new Teacher("Ali","Mammadov",'m',"SITE","PP2");
        Student s1=new Student("Ali","Mahmudov",'m',"17452");
        Student s2=new Student("Aga","Mahmudov",'m',"17453");
        PhdStudent ph1=new PhdStudent("Aga","Mahmudov",'m',"17443","Education","Marketing");
        PhdStudent ph2=new PhdStudent("Aga","Mahmudov",'m',"17440","Law","History");



        System.out.println(p1.equals(p2));

        System.out.println(s1.toString());
        System.out.println(ph2.toString());
    }
}