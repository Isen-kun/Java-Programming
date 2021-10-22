class A4 {
    int a;

    public void setValues(int x) {
        a = x;
    }

    public void printValues() {
        System.out.println("The parent class's data: " + a);
    }
}

class B4 extends A4 {
    int b;

    public void setValues(int x) {
        super.setValues(x);
        b = 90;
    }

    public void setValues(int x, int y) {
        super.setValues(x);
        b = y;
    }

    public void printValues() {
        super.printValues();
        System.out.println("The child class's data: " + b);
    }
}

public class fourth {
    public static void main(String[] args) {
        B4 obj1 = new B4();
        System.out.println("The use of Method with one parameter:");
        obj1.setValues(100);
        obj1.printValues();
        System.out.println("\nThe use of Method with two parameters");
        B4 obj2 = new B4();
        obj2.setValues(100, 200);
        obj2.printValues();
    }
}