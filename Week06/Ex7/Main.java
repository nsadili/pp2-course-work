package Week06.Ex7;

public class Main {
    public static void main(String[] args) {
        Shape[] s = { new Rectangle(5, 6), new Square(19, "yellow", false),
                new Cycle(6, "white", false), new Rectangle(78, 34, "orange", true)
        };

        printAll(s);
        resizeAll(s);

        System.out.println("\n\n\n\n new sizes:\n");
        printAll(s);

    }

    public static void resizeAll(Shape[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i].resize();
        }
    }

    public static void printAll(Shape[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
        }
    }
}
