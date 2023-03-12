public class Square extends Rectangle {

    public Square(int w){
        super(w, w);

    }


    public static void main(String[] args) {
        Object o1=new Rectangle(5, 15);
        Object o2=new Rectangle(10, 15);
        Object o3=new Square(35);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));



    }
    
}