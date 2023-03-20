package Week08;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Student {
    int id;
    String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name;
    }    
}

public class ExerciseTwo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, 37, 29, 34, 56);

        System.out.println(list.toString());
        Collections.sort(list);
        System.out.println(list.toString());

        ////////////Comparator Interface////////

        LinkedList<Student> list2 = new LinkedList<>();

        list2.add( new Student(3, "Allice"));
        list2.add( new Student(2, "Bernard"));
        list2.add( new Student(1, "Arthur"));
        list2.add( new Student(4, "Panda"));

        /* 
        Comparator<Student> com = new Comparator<>() {//anonymous class
            public int compare(Student s1, Student s2){
                return(s1.id > s2.id) ? 1 : -1;
                //return s1.id - s2.id;
            }
        };
        */

        System.out.println(list2.toString());
        //Collections.sort(list2, com);

        list2.sort(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.id - s2.id;
            }
        });

        System.out.println(list2.toString());
    }
}
