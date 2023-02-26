public class Inheritance {
    public static void main(String[] args) {
        Person p1 = new Person("Nara", "Suleymanova", "Female");
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getGender());
        p1.setFirstName("Jeyla");
        p1.setLastName("Abdullayeva");
        p1.setGender("Fem");
        String[] courses = new String[]{"Calculus", "PP2"};
        System.out.println(p1.toString());

        Teacher t1 = new Teacher("Gulnara", "Bagirova", "Female", "General", courses);
        System.out.println(t1.getDepartment());
    }
}


