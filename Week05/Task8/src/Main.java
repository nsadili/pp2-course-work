public class Main {
    public static void main(String[] args) {
       Person p = new Person("Elnar", "Ashrafov", "man");
       Person p2 = new Person("Elnar", "Ashrafov", "man");
        System.out.println(p.equals(p2));
        System.out.println( p.toString());

        Teacher t = new Teacher("Elnar", "Ashrafov", "man", "Information Technology", "PP2");
        Teacher t2 = new Teacher("Elnar", "Ashrafov", "man", "Information Technology", "PP2");
        System.out.println(t.toString());
        System.out.println(t.equals(t2));

        Student s = new Student("Elnar", "Ashrafov", "man", "000016260");
        Student s2 = new Student("Elnar", "Ashrafov", "man", "000016260");
        System.out.println(s.toString());
        System.out.println(s.equals(s2));

        PhdStudent h = new PhdStudent("Elnar", "Ashrafov", "man", "000016260", "Information Technology", "PP2");
        PhdStudent h2 = new PhdStudent("Elnar", "Ashrafov", "man", "000016260", "Information Technology", "PP2");
        System.out.println(h.toString());
        System.out.println(h2.equals(h));




    }
}