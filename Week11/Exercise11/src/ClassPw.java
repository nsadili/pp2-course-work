public class ClassPw {
    interface MinMax {
        int find(int a, int b);
    }

    public static void main(String[] args) {
        MinMax max = (int x, int y) -> (x > y) ? x : y;
        MinMax min = (int x, int y) -> (x > y) ? y : x;

        int a = 5; int b = 12;
        System.out.println(max.find(a, b));
        System.out.println(min.find(a, b));
    }
}
