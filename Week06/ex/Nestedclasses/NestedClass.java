package Nestedclasses;

public class NestedClass {
    
    public static void main(String[] args) {
         
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();

        //System.out.println(out.x + in.y);
        in.Greeting();
    }
}
