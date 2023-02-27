package ex8;

public class Main {
    public static void main(String args[]) {
        Person p1 = new Person("Asd", "Bcd", "man");
        Person p2 = new Person("Asd", "Bcd", "woman");
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));

        Teacher t1 = new Teacher("Abc", "Def", "Man", "Xyz", "b");
        Teacher t2 = new Teacher("Abc", "Def", "Man", "Xyz", "b");
        System.out.println(t1.toString());
        System.out.println(t1.equals(t2));

        Student s1 = new Student("Asd", "Bcd", "man", "15354");
        Student s2 = new Student("Asd", "Bcd", "man", "15357");
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));

        PhdStudent ps1 = new PhdStudent("jdka", "djew", "woman", "16564", "asd", "cda");
        PhdStudent ps2 = new PhdStudent("jdka", "djew", "woman", "16564", "asd", "cda");
        System.out.println(ps1.toString());
        System.out.println(ps1.equals(ps2));
    }
}
