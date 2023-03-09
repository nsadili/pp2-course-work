public class Customer {
    private int id;
    private char gender;
    private String name;

    public customer (int id, char gender, String name)
    {
        this.id = id;
        this.name=name;
        this.gender=gender;
    }

    public int getId(){
        return id;

    }

    public char getGender(){
        return gender;
        
    }
    public String getName()){
        return id;
        
    }
    
    public String toString()
    {
        return name+ "("+ id +")";
        
    }
}

