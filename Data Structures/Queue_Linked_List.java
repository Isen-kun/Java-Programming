import java.util.Scanner;

public class Queue_Linked_List {
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  Node front = null;
  Node rear = null;
  Scanner sc = new Scanner(System.in);

  public boolean isEmpty() {
    return front == null;
  }

  public void display_list() {
    if (isEmpty()) {
      System.out.println("\nThe queue is empty!");
      return;
    }

    Node node = front;
    System.out.println("\nThe current queue is:");
    while (node != null) {
      System.err.print(node.data + " -> ");
      node = node.next;
    }
    System.out.println("null");
  }

  public void enqueue() {
    int v;
    System.out.print("\nEnter the value of the new element: ");
    v = sc.nextInt();
    Node temp = new Node(v);

    if (isEmpty()) {
      front = temp;
      rear = temp;
      return;
    }
    rear.next = temp;
    rear = temp;
  }

  public void dequeue() {
    if (isEmpty()) {
      System.out.println("\nThe queue is empty");
      return;
    }

    System.out.println("\n" + front.data + " dequeued from the queue");
    if (front == rear) {
      front = null;
      rear = null;
    } else {
      front = front.next;
    }
  }

  public void peek() {
    if (isEmpty()) {
      System.out.println("\nThe queue is empty");
      return;
    }
    System.out.println("\nThe front most element is = " + front.data);
  }

  public static void main(String[] args) {
    Queue_Linked_List q = new Queue_Linked_List();
    int choice;

    while (true) {
      System.out.println("\nPress");
      System.out.println("0 to exit");
      System.out.println("1 to display the queue");
      System.out.println("2 to insert an element");
      System.out.println("3 to delete an element");
      System.out.println("4 to peek the queue");

      choice = q.sc.nextInt();

      switch (choice) {
        case 0:
          System.exit(0);
          break;

        case 1:
          q.display_list();
          break;

        case 2:
          q.enqueue();
          break;

        case 3:
          q.dequeue();
          break;

        case 4:
          q.peek();
          break;

        default:
          System.out.println("Enter a valid command");
      }
    }
  }
}
