abstract class A {
  abstract void display();
}

class first extends A {
  void display() {
    System.out.println("Abstracted method print statement.");
  }

  public static void main(String[] args) {
    first obj = new first();
    obj.display();
  }
}