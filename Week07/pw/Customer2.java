class Customer2 {
    
    private int ID;
    private String name;
    private char gender;
    private int discount;


    public Customer2(int ID, String name, char gender, int discount){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }


    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public char getGender() {
        return gender;
    }

    public void setDiscount(int discount){
        this.discount = discount;
    }

    public int getDiscount(){
        return discount;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString(){

        return this.name + "(" + this.ID + ")";
    }

    

}

