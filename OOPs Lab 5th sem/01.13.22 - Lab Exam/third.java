import java.util.Scanner;

public class third {
  public static int count;

  public third() {
    count++;
    System.out.println("The number of object created: " + count);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Student name: RAJORSHI GHOSH");
    System.out.println("Makaut Roll no: 14800119019");
    while (true) {
      String choice;
      System.out.println("\nWould you like to create an object?(y/n): ");
      choice = sc.next();
      if (choice.equals("y")) {
        third obj = new third();
      } else if (choice.equals("n")) {
        break;
      } else {
        System.out.println("Enter a valid choice");
      }
    }
    System.out.println("\nTotal number of Objects created in the end: " + third.count);
    sc.close();
  }
}