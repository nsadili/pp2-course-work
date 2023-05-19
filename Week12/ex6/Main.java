package Week12.ex6;

import java.io.*;

class Person implements Serializable {
    int id;
    String fname;
    String lname;

    public Person(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String toString() {
        return "Person[id = " + id + ", fname = " + fname + ", lname = " + lname + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        String filename = "E:/Java Projects/pp2-course-work/Week12/resources/persons.dat";
        Person[] persons = new Person[] { new Person(1, "Ali", "Aliyev"), new Person(2, "Muhammed", "Faud"),
                new Person(3, "Samir", "Musayev") };
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
                for (Person p : persons) oos.writeObject(p);
                while (true) System.out.println(ois.readObject());
        } catch (EOFException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
