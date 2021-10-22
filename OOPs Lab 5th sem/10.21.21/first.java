class A1 {
    int a;

    public A1() {
        a = 10;
    }

    public void printValues() {
        System.out.println("The parent class's data: " + a);
    }
}

class B1 extends A1 {
    int b;

    public B1() {
        b = 20;
    }

    public void printValues() {
        super.printValues();
        System.out.println("The child class's data: " + b);
    }
}

class first {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.printValues();
    }

}