public class Car {
    private String  model;
    private int productionYear; 
    private double price; 

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setPrice(double price)
    {
        this.price = price; 
    }

    public double getPrice()
    {
        return this.price;
    }

    
    public Car (String model, int productionYear, double price) {
        this.model = model;
        this.productionYear = productionYear;
        this.price = price;

    }


    public Car (String model, double price) {
        this.model = model;
        this.price = price;

    }


    public Car () {
    
    }

    @Override
    public String toString()
    {
        return "Model       :    " + this.model + '\n' + 
               "Production  :    " + this.productionYear + '\n' +
               "Price       :    " + this.price;
    }
    
}

