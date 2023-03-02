package Interface;

public interface Task1 {
    double calcCircumference(double radius);
    double calcArea(double radius);
}

  class Circle implements Task1 {
    public double calcCircumference(double radius) {
        return 2*Math.PI*radius;
    }

    public double calcArea(double radius) {
        return Math.PI * Math.pow(radius,2);
        }
}
    