public class GenericPair<R, A> {
        private final R key;
        private final A value;
    
        public GenericPair(R key, A value) {
            this.key = key;
            this.value = value;
        }
    
        public R getKey() {
            return key;
        }
    
        public A getValue() {
            return value;
        }
    
        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    
    
}