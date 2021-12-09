abstract class C {
  abstract void display1();

  abstract void display2();
}

class third extends C {
  void display1() {
    System.out.println("Print statement for first abstract method");
  }

  void display2() {
    System.out.println("\nPrint statement for second abstract method");
  }

  public static void main(String[] args) {
    third obj = new third();
    obj.display1();
    obj.display2();
  }
}
