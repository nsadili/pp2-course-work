public class Stack {
  private int[] data;
  private int top;

  public Stack(int size) {
    data = new int[size];
    top = -1;
  }

  public void push(int element) {
    if (top == data.length - 1) {
      throw new StackFullException();
    }
    data[++top] = element;
  }

  public int pop() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }
    return data[top--];
  }

  public int peek() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }
    return data[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }
}
