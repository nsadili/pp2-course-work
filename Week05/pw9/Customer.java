public class Customer
{
    private int id1;
    private String name;
    private char gender;
    private int discount;

    public Customer(int id1, String name, char gender, int discount)
    {
        this.id1 = id1;
        this.name = name; 
        this.gender = gender;
        this.discount = discount;
    }

    public int getId1()
    {
        return id1;
    }

    public void setId1(int id1)
    {
        this.id1 = id1;
    }

    public String getName()
    {
        return name; 
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public int getDiscount()
    {
        return discount;
    }

    public void setDiscount(int discount)
    {
        this.discount = discount;
    }

    public String toString()
    {
        return "Id1: " + id1 + " " + "Name: " + name + " " + "Gender: " + gender + " " + "Discount: " + discount;
    }

}    

