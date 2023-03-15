public class QuizTest {
    private Integer nbItems;
    { this.nbItems = 1; }

    public QuizTest(int nbItems) { this.nbItems = nbItems; }
   
}

class Main{
    public static void main(String[] args) {
        QuizTest c1 = new QuizTest(5), 
        c2 = new QuizTest(10), 
        c3 = new QuizTest(15);

        c1.nbItems = c2.nbItems;
        c2 = c1;
        c3 = null;

        System.out.println("c1: " + c1.nbItems);
        System.out.println("c2: " + c2.nbItems);
        System.out.println("c3: " + c3.nbItems);

    }
}
