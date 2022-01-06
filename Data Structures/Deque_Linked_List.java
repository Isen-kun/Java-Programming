import java.util.Scanner;

public class Deque_Linked_List {
  static class Node {
    int data;
    Node prev, next;

    public Node(int data) {
      this.data = data;
      next = null;
      prev = null;
    }
  }

  Scanner sc = new Scanner(System.in);
  Node front = null;
  Node rear = null;

  public boolean isEmpty() {
    return front == null;
  }

  public void display_forward() {
    if (isEmpty()) {
      System.out.println("\nThe deque is empty!");
      return;
    }

    Node node = front;
    System.out.println("\nThe current deque from front is:");
    while (node != null) {
      System.out.print(node.data + " -> ");
      node = node.next;
    }
    System.out.println("null");
  }

  public void display_backward() {
    if (isEmpty()) {
      System.out.println("\nThe deque is empty!");
      return;
    }

    Node node = rear;
    System.out.println("\nThe current deque from back is:");
    while (node != null) {
      System.out.print(node.data + " -> ");
      node = node.prev;
    }
    System.out.println("null");
  }

  public void add_in_front() {
    int v;
    System.err.print("\nEnter the value of the node which is to be added in front: ");
    v = sc.nextInt();
    Node temp = new Node(v);

    if (isEmpty()) {
      front = temp;
      rear = temp;
      return;
    }
    front.prev = temp;
    temp.next = front;
    front = temp;
  }

  public void add_in_rear() {
    int v;
    System.err.print("\nEnter the value of the node which is to be added in rear: ");
    v = sc.nextInt();
    Node temp = new Node(v);

    if (isEmpty()) {
      front = temp;
      rear = temp;
      return;
    }
    rear.next = temp;
    temp.prev = rear;
    rear = temp;
  }

  public void remove_from_front() {
    if (isEmpty()) {
      System.out.println("\nThe deque is empty!");
      return;
    }

    System.out.println("\nThe element removed from the front is = " + front.data);
    if (front == rear) {
      front = null;
      rear = null;
      return;
    }
    front = front.next;
    front.prev = null;
  }

  public void remove_from_rear() {
    if (isEmpty()) {
      System.out.println("\nThe deque is empty!");
      return;
    }

    System.out.println("\nThe element removed from the rear is = " + rear.data);
    if (front == rear) {
      front = null;
      rear = null;
      return;
    }
    rear = rear.prev;
    rear.next = null;
  }

  public void peek_front() {
    if (isEmpty()) {
      System.out.println("\nThe deque is empty!");
      return;
    }
    System.err.println("\nThe element in front is = " + front.data);
  }

  public void peek_rear() {
    if (isEmpty()) {
      System.out.println("\nThe deque is empty!");
      return;
    }
    System.err.println("\nThe element in rear is = " + rear.data);
  }

  public static void main(String[] args) {
    Deque_Linked_List dq = new Deque_Linked_List();
    int choice;

    while (true) {
      System.out.println("\nPress");
      System.out.println("0 to exit");
      System.out.println("1 to display the deque from front");
      System.out.println("2 to display the deque from rear");
      System.out.println("3 to add an element in front");
      System.out.println("4 to add an element in rear");
      System.out.println("5 to remove an element from front");
      System.out.println("6 to remove an element from rear");
      System.out.println("7 to peek the deque from front");
      System.out.println("8 to peek the deque from rear");

      choice = dq.sc.nextInt();

      switch (choice) {
        case 0:
          System.exit(0);
          break;

        case 1:
          dq.display_forward();
          break;

        case 2:
          dq.display_backward();
          break;

        case 3:
          dq.add_in_front();
          break;

        case 4:
          dq.add_in_rear();
          break;

        case 5:
          dq.remove_from_front();
          break;

        case 6:
          dq.remove_from_rear();
          break;

        case 7:
          dq.peek_front();
          break;

        case 8:
          dq.peek_rear();
          break;

        default:
          System.out.println("Enter a valid command");
      }
    }
  }
}
