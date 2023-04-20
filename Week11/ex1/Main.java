package ex1;

public class Main {
    public static void main(String[] args) {
        
        AFunctInt func= new AFunctInt() {

            @Override
            public void apply(String str) {
                System.out.println("Anonymus"+str);
            }
            
        };

        func.apply("Programming");
    }
}
