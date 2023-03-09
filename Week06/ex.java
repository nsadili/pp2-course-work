interface T1 {
    int k = 3;
}

    class T2 implements T1 {
    void mult () {k *= 10; }}
    class Main extends T2 {
    public static void main (String[] args) {
    new Main ().mult ();
    System.out.println (k);
    }}