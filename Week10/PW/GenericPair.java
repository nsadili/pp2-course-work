public class Pair<Friend1, Friend2> {
    private final Friend1 friend1;
    private final Friend2 friend2;

    public Pair(Friend1 friend1, Friend2 friend2) {
        this.friend1 = friend1;
        this.friend2 = friend2;
    }

    public Friend1 getFriend1() {
        return friend1;
    }

    public Friend2 getFriend2() {
        return friend2;
    }

    public String toString() {
        return friend1 + friend2;
    }
}

    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<>("akber", "Huseyn");
        Pair<String, String> p2 = new Pair<>("Asgar", "Ismayil");

        System.out.println(p1.getFriend1());    // "Akber"
        System.out.println(p1.getFriend2());    // "Huseyn"
        System.out.println(p1);                 // "(Akber, Huseyn)"

        System.out.println(p2.getFriend1());    // "Asgar"
        System.out.println(p2.getFriend2());    // "Ismayil"
        System.out.println(p2);                 // "(Asgar, Ismayil)"
    }
    /* With the promotion of generics class i have created two types named friend1 and friend 2.
    After i used the main class and made operations on both on them
     */
}