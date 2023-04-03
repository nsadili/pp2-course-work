//https://www.geeksforgeeks.org/stack-class-in-java/
//https://www.javatpoint.com/java-stack
//https://www.simplilearn.com/tutorials/data-structure-tutorial/stack-implementation-using-linked-list
//https://www.javaguides.net/2018/09/stack-implementation-using-linked-list-in-java.html
//public class Stack {
  //  private int[] elements;
//    private int capacity;
  //  private int index;
//
  //  public Stack(int capacity) throws Exception {
    //    if (capacity < 0)
      //      throw new Exception();
        //else
          //  this.capacity = capacity;
        //this.index = -1;
        //this.elements = new int[capacity];
    //}

    //public boolean isEmpty() {
//        return this.index == -1;
//    }

  //  public boolean isFull() {
    //    return this.index == capacity - 1;
    //}

    //public int peek() throws Exception {
        //if (elements[1] == 0)
          //  throw new Exception();

        //return elements[index];
    //}

    //public int pop() throws Exception {
      //  if (elements[-1] == 0)
        //    throw new Exception();
        //else
          //  return elements[index--];
    //}

    //public void push(int el) throws Exception {
      //  if (elements[index] == capacity - 1)
        //    throw new Exception();
        //elements[++index] = el;
   // }

    //public void __print() {
      //  if (this.isEmpty()) {
        //    System.out.println("Empty stack.");
          //  return;
        //}
        //System.out.print("Bottom");
        //for (int i = 0; i <= index; i++) {
          //  System.out.print(" || " + elements[i]);
        //}
        //System.out.println(" || Top");
    //}

    //public static void main(String[] args) throws Exception {
      //  Stack stack = new Stack(5);
        //try {
          //  stack.pop();

        //} catch (Exception e) {
          //  e.printStackTrace();
        //}

        //stack.push(3);
        //stack.push(5);
        //stack.push(7);
        //stack.push(10);
        //stack.push(100);
        //stack.push(200000);

        //stack.__print();

        //while (!stack.isEmpty()) {
          //  System.out.println(stack.pop());
        //}

    //}
//}
public class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty.");
        }
        return top.data;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty.");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void __print() {
        if (isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        Node current = top;
        while (current != null) {
            System.out.print(" || " + current.data);
            current = current.next;
        }
        System.out.println(" || Top");
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        try {
            stack.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        stack.push(200000);

        stack.__print();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

//This implementation uses a Node class to represent each element of the Stack. The top variable holds the reference to the top Node of the Stack. The size variable stores the number of elements in the Stack.

//The push method creates a new Node with the given data, sets its next field to the current top, and updates the top variable to point to the new Node.

//The pop method removes the top Node, updates the top variable to point to the next Node, and returns the data of the removed Node.

//The peek method returns the data of the top Node without removing it.

//The getSize method returns the number of elements in the Stack.

//The __print method prints the elements of the Stack from the bottom to the top.