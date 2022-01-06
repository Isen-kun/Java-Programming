import java.util.Scanner;

public class Singular_Linked_List {
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  Node head = null;
  Scanner sc = new Scanner(System.in);

  public void create_list() {
    int n, v;
    System.out.print("\nEnter the number of elements you would like to create: ");
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Enter the value: ");
      v = sc.nextInt();
      Node temp = new Node(v);
      if (head == null) {
        head = temp;
      } else {
        Node node = head;
        while (node.next != null) {
          node = node.next;
        }
        node.next = temp;
      }
    }
  }

  public void display_list() {
    Node temp = head;
    System.out.println("\nThe current list is: ");
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add_at_pos() {
    int p, v;
    System.out.print("\nEnter the position at which new node is to be entered: ");
    p = sc.nextInt();
    System.out.print("Enter the value of the new node: ");
    v = sc.nextInt();
    Node temp = new Node(v);

    if (p == 1) {
      temp.next = head;
      head = temp;
      return;
    }
    Node node = head;
    try {
      for (int i = 1; i < p - 1; i++) {
        node = node.next;
      }
    } catch (Exception e) {
      System.out.println("Enter a valid position!");
      return;
    }
    temp.next = node.next;
    node.next = temp;
  }

  public void add_after_val() {
    int x, v;
    System.out.print("\nEnter the element after which new element is to be added: ");
    x = sc.nextInt();

    Node node = head;
    try {
      while (node.data != x) {
        node = node.next;
      }
    } catch (Exception e) {
      System.out.println("The element was not found!");
      return;
    }
    System.out.print("Enter the value of the new element: ");
    v = sc.nextInt();
    Node temp = new Node(v);
    temp.next = node.next;
    node.next = temp;
  }

  public void add_before_val() {
    int x, v;
    System.out.print("\nEnter the element after before which new element is to be added: ");
    x = sc.nextInt();
    System.out.print("Enter the value of the new node: ");
    v = sc.nextInt();
    Node temp = new Node(v);

    if (head.data == x) {
      temp.next = head;
      head = temp;
      return;
    }

    Node node = head;
    try {
      while (node.next.data != x) {
        node = node.next;
      }
    } catch (Exception e) {
      System.out.println("The element was not found!");
      return;
    }

    temp.next = node.next;
    node.next = temp;
  }

  public void del_node_pos() {
    int p;
    System.out.print("\nEnter the position of the node which is to be deleted: ");
    p = sc.nextInt();

    if (p == 1) {
      head = head.next;
      return;
    }

    Node node = head;
    try {
      for (int i = 1; i < p - 1; i++) {
        node = node.next;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return;
    }
    node.next = node.next.next;
  }

  public void del_node_val() {
    int x;
    System.out.print("\nEnter the value of the element which is to be deleted: ");
    x = sc.nextInt();

    if (head.data == x) {
      head = head.next;
      return;
    }

    Node node = head;
    try {
      while (node.next.data != x) {
        node = node.next;
      }
    } catch (Exception e) {
      System.out.println("The element was not found!");
      return;
    }

    node.next = node.next.next;
  }

  public void reverse_iterative() {
    Node prevNode = head;
    Node currNode = head.next;

    while (currNode != null) {
      Node nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }

    head.next = null;
    head = prevNode;
  }

  public static void main(String[] args) {
    Singular_Linked_List ll = new Singular_Linked_List();
    int choice;

    while (true) {
      System.out.println("\nPress");
      System.out.println("0 to exit");
      System.out.println("1 to create a list");
      System.out.println("2 to display the list");
      System.out.println("3 to add an element to a particular position");
      System.out.println("4 to add an element after a particular element");
      System.out.println("5 to add an element before a particular element");
      System.out.println("6 to delete an element from particular position");
      System.out.println("7 to delete a particular element");
      System.out.println("8 to reverse the linked list");

      choice = ll.sc.nextInt();

      switch (choice) {
        case 0:
          System.exit(0);
          break;

        case 1:
          ll.create_list();
          break;

        case 2:
          ll.display_list();
          break;

        case 3:
          ll.add_at_pos();
          break;

        case 4:
          ll.add_after_val();
          break;

        case 5:
          ll.add_before_val();
          break;

        case 6:
          ll.del_node_pos();
          break;

        case 7:
          ll.del_node_val();
          break;

        case 8:
          ll.reverse_iterative();
          break;

        default:
          System.out.println("Enter a valid command!");
      }
    }
  }
}