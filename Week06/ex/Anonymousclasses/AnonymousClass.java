package Anonymousclasses;

public class AnonymousClass {
    public static void main(String[] args) {
        
        Greeting greeting = new Greeting() {

            public void Welcome() {
                System.out.println("Heyyy Hi!");
            }

        };
        Greeting greeting2 = new Greeting();

        greeting.Welcome();
        greeting2.Welcome();

    }
}
