package pp2.week10;

public class GenericPairClass<T, U>
{
        private T key;
        private  U value;

        public void Pair(T key, U value) {
            this.key = key;
            this.value = value;
        }

    public GenericPairClass(T key, U value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
            return key;
        }

        public U getValue() {
            return value;
        }


    }
