abstract class Fruit {
  String Shape, Color;

  Fruit(String shape, String color) {
    Shape = shape;
    Color = color;
  }

  abstract void getColor();

  void getShape() {
    System.out.println("The Shape of the Fruit is: " + Shape);
  }
}

class Mango extends Fruit {
  Mango(String shape, String color) {
    super(shape, color);
  }

  void getColor() {
    System.out.println("The color of the fruit is: " + Color);
  }

  public static void main(String[] args) {
    Mango obj = new Mango("Elongated", "Yellow");
    obj.getColor();
    obj.getShape();
  }

}
