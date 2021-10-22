class A3 {
    int a;

    public A3(int x) {
        a = x;
    }

    public void printValues() {
        System.out.println("The parent class's data: " + a);
    }
}

class B3 extends A3 {
    int b;

    public B3() {
        super(40);
        b = 60;
    }

    public B3(int x) {
        super(x);
        b = 60;
    }

    public void printValues() {
        super.printValues();
        System.out.println("The child class's data: " + b);
    }
}

public class third {
    public static void main(String[] args) {
        B3 obj1 = new B3();
        System.out.println("The use of default constructor:");
        obj1.printValues();
        System.out.println("\nThe use of parameterized constructor:");
        B3 obj2 = new B3(70);
        obj2.printValues();
    }

}