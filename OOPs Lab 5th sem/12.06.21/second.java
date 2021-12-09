abstract class B {
  abstract void display1();

  void display2() {
    System.out.println("\nPrint statement for Non bstract method");
  }
}

class second extends B {
  void display1() {
    System.out.println("Print statement for abstract method");
  }

  public static void main(String[] args) {
    second obj = new second();
    obj.display1();
    obj.display2();
  }
}
