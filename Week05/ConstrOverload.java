public class ConstrOverload {
    
    int a, b;

    public ConstrOverload() {
        this(10, 15);
    }

    public ConstrOverload(int a) {
        this(a, 15);
    }

    public ConstrOverload(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + " " + b;
    } 

    public static void main(String[] args){

        ConstrOverload thing = new ConstrOverload();
        
        System.out.println(thing);
    
    }

}
