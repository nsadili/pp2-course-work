package Week05.pw8;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + gender + ")";
    }

    public boolean equals(Person p) {
        return this.firstName == p.firstName && this.lastName == p.lastName && this.gender == p.gender;
    }
}
