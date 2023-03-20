public class PW7<T> {
    private Node<T> top;
    private int size;

    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
        size++;
    }

    public T pop() {
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
