class Customer {
    private int ID;
    private String name;
    private char gender;
    private int discount;

    public Customer(int ID, String name, int discount){
        this.ID=ID;
        this.name=name;
        this.discount=discount;

    }
    //getters
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }
    public String toString(){
        return getName()+"("+getID()+")";
    }
}
