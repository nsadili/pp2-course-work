package pp2.week05;

import pp2.week05.Rectangle;

public class rectangleTest {
    Rectangle r1=new Rectangle (5,10);
    Rectangle r2 = new Rectangle(15, 10);
    Rectangle r3 = new Rectangle(5, 10);

    {
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));

    }
}
