package ex1;

public class Main {
    public static void main(String[] args) {
        AFuncInt f=new AFuncInt(){
            public void apply(String str){
                System.out.println("Anonymus -> "+ str);
            }
        };
        AFuncInt lam;
        lam=(str) -> System.out.println("Anonymus -> "+ str);
        AFuncInt.print("Hello");
        f.print("Hello","World");
        f.apply("Name");
        System.out.println("============================");
        AFuncInt.print("Hello");
        lam.print("Hello","World");
        lam.apply("Name");
    }
}
