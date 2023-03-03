public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }




    @Override
    public String toString(){
        return "Name: " + this.firstName + " Surname: " + this.lastName + " Gender: " + this.gender;
    }

    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }
        return firstName.equals(p.firstName) && lastName.equals(p.lastName) && gender.equals(p.gender);
    }
}