class Magazine implements Comparable<Magazine> {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }

    public String toString() {
        return name;
    }
}

class Newsstand {
    public static void main(String[] args) {
        var set = new TreeSet<Magazine>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        System.out.println(set.iterator().next());
    }
}