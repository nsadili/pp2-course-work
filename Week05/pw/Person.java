package Week05.pw;

public class Person {
    private String firstName, lastName, gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person(Person p) {
        this(p.getFirstName(), p.getLastName(), p.getGender());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + ", " + this.gender;
    }

    public boolean equals(Person p) {
        return this.firstName == p.getFirstName() && this.lastName == p.getLastName() && this.gender == p.getGender();
    }
}
