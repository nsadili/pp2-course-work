package pp2.week06;
import pp2.week06.rectangle;

public class rectangleTest {
    rectangle r1 = new rectangle(5, 10);
    rectangle r2 = new rectangle(15, 10);
    rectangle r3 = new rectangle(5, 10);

    {
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

}
    public static class Rectangle implements Cloneable {
        private int width, height;

        public Rectangle(int w, int h) {
            this.width = w;
            this.height = h;
        }

        public boolean equals(Object obj) {
            if (obj == this)
                return true;

            else return false;
        }
    }
}
