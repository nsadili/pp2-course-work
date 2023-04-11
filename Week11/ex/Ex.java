public class Ex {

    public interface Runnable {
        public abstract void run ();
    }

    public interface Comparator<T> {
       public int compare(T o1, T o2);

       public boolean equals(Object obj);
    }

    @FunctionalInterface
    public interface AnotherFuncInt {

        public void apply(String word);

        public static void print(String word) {
            System.out.println(word);
        }

        public default void print(String word, String pref) {
            System.out.println(pref + ": " + word);
        }
    }

    public static void main(String[] args) {
        //TODO 
    }
}