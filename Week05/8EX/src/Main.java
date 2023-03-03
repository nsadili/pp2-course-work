public class Main {
    public static void main(String[] args) {
        Person p = new Person("Samad", "Ganbarov", "man");
        Person p2 = new Person("Huseyn", "Azizov", "man");
        System.out.println( p2.toString());
        System.out.println(p.equals(p2));

        Teacher t = new Teacher("Samad", "Ganbarov", "man", "Information Technology", "PP2");
        Teacher t2 = new Teacher("Elcan", "Alisoy", "man", "Student", "PP2");
        System.out.println(t2.toString());
        System.out.println(t.equals(t2));

        Student s = new Student("Samad", "Ganbarov", "man", "000016014");
        Student s2 = new Student("Elcan", "Alisoy", "man", "000016012");
        System.out.println(s2.toString());
        System.out.println(s.equals(s2));

        PhdStudent h = new PhdStudent("Samad", "Ganbarov", "man", "000016014", "Information Technology", "PP2");
        PhdStudent h2 = new PhdStudent("Elcan", "Alisoy", "man", "000016012", "Student", "PP2");
        System.out.println(h2.toString());
        System.out.println(h2.equals(h));




    }
}
