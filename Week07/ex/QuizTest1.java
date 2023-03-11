interface Int1{ int NUM = 10; }
interface Int2{ int NUM = 20; }

class QuizTest1 implements Int1, Int2 {
    public static void main(String[] args) {
        System.out.println(new QuizTest1().NUM);
    }
}