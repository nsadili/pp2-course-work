public class Customer {

    private int id;

    private String name;

    private char gender; // m or f

    public Customer(int id, String name, int discount){

            this.id=id;
            this.name=name;

    }

    public Customer(int id, String name, char gender){

        this.id=id;
        this.name=name;
        this.gender=gender;

}

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public char getGender(){

        return this.gender;

    }

    public String toString(){

        return String.format("%s(%d)", this.name,this.id);

    }




}
