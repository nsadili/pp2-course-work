public class Task12Square {
    public static void main(String[] args){
        Object o1 = new Rectangle(5,10);
        Object o2 = new Rectangle(15,15);
        Object o3 = new Square(15);
        System.out.println("Objects are identical: "+o1.equals(o2));
        System.out.println("Objects are identical: "+o1.equals(o3));
        System.out.println("Objects are identical: "+o2.equals(o3));

    }
}

class Square extends Rectangle{
    private int side;
    Square(int side){
        this.side = side;
    }
}

class Rectangle{
    int width, height;
    Rectangle(){}
    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        return rect.width == this.width && rect.height == this.height;
    }
}
