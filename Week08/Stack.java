public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

     
        stack.push(1);
        stack.push(2);
        stack.push(3);

      
        try {
            System.out.println(stack.pop()); 
            System.out.println(stack.pop()); 
            System.out.println(stack.pop()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
