package Week05;

public class MainPerson {
    public static void main(String[] args) {
        Person person=new Person("Murad", "Tahmazli", "M");
        Person person1=new Person("Kamran", "Tahmazli", "M");
        Teacher teacher=new Teacher("Narimanov", "Medical", person);
        Teacher teacher1=new Teacher("Neftciler", "Sociology", person1);
        Student student=new Student("93B", person1);
        Student student1=new Student("92C", person);
        PhdStudent phd=new PhdStudent("Narimanov", "Programming 1", student1);
        PhdStudent phd1=new PhdStudent("Ganjlik", "Programming 2", student);
        
        
        
        System.out.println(person.toString());
        System.out.println(teacher.toString());
        System.out.println(student.toString());
        System.out.println(phd.toString());
        System.out.println(person.equals(person1));
        System.out.println(teacher.equals(teacher1));
        System.out.println(student.equals(student1));
        System.out.println(phd.equals(phd1));

      }
}
