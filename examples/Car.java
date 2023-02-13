package examples;

public class Car {
    int productionYear;
    double price;
    String model;

    public Car(int productionYear, double price, String model){
        this.productionYear = productionYear;
        this.price = price;
        this.model = model;
    }

    public void getModel(String model){
        this.model = model;
    }
}


