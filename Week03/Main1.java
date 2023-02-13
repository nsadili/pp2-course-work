public class Main1 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2019, 50000);
        Car c2 = new Car("Mercedes", 2017, 30000);
        
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        c2 = c1; 
        c2.setModel("Prius");
        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
    }
}

