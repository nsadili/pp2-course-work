public class Customer {
    private String id;
    private char gender;
    private String name;

    public void customer (String id, char gender, String name)
    {
        this.id = id;
        this.name=name;
        this.gender=gender;
    }

    public String getId(){
        return id;

    }

    public char getGender(){
        return gender;
        
    }
    public String getName(){
        return id;
        
    }
    
    public String toString()
    {
        return name+ "("+ id +")";
        
    }
}