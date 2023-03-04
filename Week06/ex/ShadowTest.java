public class ShadowTest {
    public int x = 0;
    class FirstLevel {
    public int x = 1;
    void methodInFirstLevel(int x) {
    System.out.println("x = " + x + "\nthis.x = " + this.x + "\nShadowTest.this.x = " + ShadowTest.this.x);
    }
    }
    public static void main(String [] args) {
    ShadowTest st = new ShadowTest();
    ShadowTest.FirstLevel fl = st.new FirstLevel();
    fl.methodInFirstLevel(23);
    }
    }