package Week05.Person;

public class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }


    public String toString(){
        return "Name of the person: " + getFirstName()
        + "\nSurname of the person: " + getLastName()
        + "\nGender of the person: " + getGender();
    }


    public boolean equals(Person P){
        return this.firstName.equals(P.getFirstName()) 
        && this.lastName.equals(P.getLastName())
        && this.gender.equals(P.getGender());
    } 

}
