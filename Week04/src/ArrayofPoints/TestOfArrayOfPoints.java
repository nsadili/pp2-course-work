package ArrayofPoints;

public class TestOfArrayOfPoints {

    public static void main(String[] args) {

        ArrayOfPoints p1 = new ArrayOfPoints(3, 4);
        ArrayOfPoints p2 = new ArrayOfPoints(-2, -5);
        ArrayOfPoints p3 = new ArrayOfPoints(6, -1);
        ArrayOfPoints p4 = new ArrayOfPoints(-3, -2);

        double distance = p1.getDistance(p2);
        double distance2 = p1.getDistance(p3);
        double distance3 = p1.getDistance(p3);
        double distance4 = p1.getDistance(p4);

        System.out.println(distance);
        System.out.println(distance2);
        System.out.println(distance3);
        System.out.println(distance4);

        String closestPole1 = p1.getClosestPole();
        String closestPole2 = p2.getClosestPole();
        String closestPole3 = p3.getClosestPole();
        String closestPole4 = p4.getClosestPole();

        System.out.println("Closest pole to p1: " + closestPole1);
        System.out.println("Closest pole to p2: " + closestPole2);
        System.out.println("Closest pole to p3: " + closestPole3);
        System.out.println("Closest pole to p4: " + closestPole4);
    }
}
