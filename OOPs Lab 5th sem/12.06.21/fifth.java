abstract class D {
  String data = "This is the required data";

  D() {
    System.out.println("Print statement of abstract class constructor");
  }

  void display1() {
    System.out.println("\nDisplaying data member through nomral method");
    System.out.println("Data member of abstract class: " + data);
  }

  abstract void display2();

}

class fifth extends D {
  void display2() {
    System.out.println("\nDisplaying data member through abstract method");
    System.out.println("Data member of abstract class: " + data);
  }

  public static void main(String[] args) {
    fifth obj = new fifth();
    obj.display1();
    obj.display2();
  }
}
