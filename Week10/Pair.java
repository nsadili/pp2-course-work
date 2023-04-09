public class Pair<First, Second> {
    First first;
    Second second;

    public Pair(First first, Second second) {
        this.first = first;
        this.second = second;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public static void main(String[] args) {
        
        Pair<String, Integer> user1 = new Pair<String,Integer>("[insert name]", 1234);
        System.out.println("Name: " + user1.getFirst());
        System.out.println("ID: " + user1.getSecond());

    }
}
