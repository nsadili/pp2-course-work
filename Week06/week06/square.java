package pp2.week06;
import pp2.week06.rectangle;
import java.util.*;
public class square extends pp2.week06.rectangle {
    int side;
    public square(int side){
        super (side,side);
        this.side=side;
    }
    Object o1=new pp2.week06.rectangle(5,10);
    Object o2= new rectangle(15, 15);
    Object o3 = new square( 15);

    {
        System.out.println("Objects are identical:" + o1.equals(o2));
        System.out.println("Objects are identical:" + o1.equals(o3));
        System.out.println("Objects are identical:" + o2.equals(o3));

    }
}