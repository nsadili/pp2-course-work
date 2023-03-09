public class Person {
    private String firstName, lastName, gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

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

    public String toString(){
        return "Name: "+this.firstName+" - Surname: "+this.lastName+" - Gender: "+this.gender;
    }

    public boolean equals(Person p){
        return this.firstName==p.firstName && this.lastName==p.lastName && this.gender==p.gender;
    }




}
