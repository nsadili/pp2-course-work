package PW;
import java.io.Serializable;

class Person implements Serializable {
    int id;
    String fname;
    String lname;

    public Person(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return firstname;
    }

    public String getLname() {
        return lastname;
    }

    public String toString() {
        return "Person [id = " + id + ", firstname = " + firstname + ", lastname = " + lastname + "]";
    }
}
