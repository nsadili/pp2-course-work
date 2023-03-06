package pp2.week06;

import pp2.week05.Rectangle;

public class Square extends pp2.week05.Rectangle {
    int side;

    public Square(int side){
        super (side,side);
        this.side=side;
    }
    Object o1=new pp2.week05.Rectangle(5,10);
    Object o2= new Rectangle(15, 15);
    Object o3 = new Square( 15);

    {
        System.out.println("Objects are identical:" + o1.equals(o2));
        System.out.println("Objects are identical:" + o1.equals(o3));
        System.out.println("Objects are identical:" + o2.equals(o3));

    }
}
