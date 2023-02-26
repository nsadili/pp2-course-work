 class Customer {
    private int id;
    private String name;
    private char gender;
    private int discount;

    public Customer(int id, String name, int discount ) {
        this.id=id;
        this.name=name;
        this.gender='f';
        this.discount=discount;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getDiscount() {
        return discount;
    }

    public void setID(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name=name;
    }

    public void setGender(char gender) {
        this.gender=gender;
    }

    public void setDiscount(int discount) {
        this.discount=discount;
    }

    public String toString() {
        return "ID: " + this.id + " Name: " + this.name;
    }
    
}
