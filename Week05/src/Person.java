package Week05.src;

import java.util.*;

public class Person {
    private String FirstName;
    private String LastName;
    private String Gender;

    public Person(String FirstName, String LastName, String gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return " {FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender + "]";
    }

    public boolean equals(Person p) {
        return this.FirstName.equals(p.getFirstName()) && this.LastName.equals(p.getLastName()) && this.Gender.equals(p.getGender());
    }

}
