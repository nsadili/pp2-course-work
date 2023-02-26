package week05;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String toString() {
        return firstName + " " + lastName + " " + gender;
    }

    public boolean equals(Person p) {
        return Objects.equals(firstName, p.firstName) &&
                Objects.equals(lastName, p.lastName) &&
                Objects.equals(gender, p.gender);
    }
}
