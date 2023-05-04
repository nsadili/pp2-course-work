public class Customer  {
    private Int ID;
    private String Name;
    private char Gender;

    public Customer(Int Id, String Name, char Gender) {
       this.id = id;
       this.name = name;
       this.gender = gender;
    }

    public Int getId() {
        return Id;
    }

    public void setId(Int Id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }


}