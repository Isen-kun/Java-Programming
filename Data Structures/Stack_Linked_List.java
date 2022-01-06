import java.util.Scanner;

public class Stack_Linked_List {
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  Node top = null;
  Scanner sc = new Scanner(System.in);

  public boolean isEmpty() {
    return top == null;
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("\nThe stack is empty!");
      return;
    }

    System.out.println("\nThe current stack is:");
    Node node = top;
    while (node != null) {
      System.out.print(node.data + " -> ");
      node = node.next;
    }
    System.out.println("null");
  }

  public void push() {
    int v;
    System.out.println("\nEnter the value of the new element to be entered in stack");
    v = sc.nextInt();
    Node temp = new Node(v);

    if (isEmpty()) {
      top = temp;
      return;
    }
    temp.next = top;
    top = temp;
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("\nStack Underflow!");
      return;
    }

    System.out.println("\n" + top.data + " popped from the stack");
    top = top.next;
  }

  public void peek() {
    if (isEmpty()) {
      System.out.println("\nThe stack is empty!");
      return;
    }

    System.out.println("\nThe element of top is = " + top.data);
  }

  public static void main(String[] args) {
    Stack_Linked_List st = new Stack_Linked_List();
    int choice;

    while (true) {
      System.out.println("\nPress");
      System.out.println("0 to exit");
      System.out.println("1 to display the stack");
      System.out.println("2 to push an element in the stack");
      System.out.println("3 to pop an element from the stack");
      System.out.println("4 to peek the stack");

      choice = st.sc.nextInt();

      switch (choice) {
        case 0:
          System.exit(0);
          break;

        case 1:
          st.display();
          break;

        case 2:
          st.push();
          break;

        case 3:
          st.pop();
          break;

        case 4:
          st.peek();
          break;

        default:
          System.out.println("Enter a valid command!");
      }
    }
  }
}
