class A2 {
    int a;

    public A2() {
        a = 20;
    }

    public void printValues() {
        System.out.println("The parent class's data: " + a);
    }
}

class B2 extends A2 {
    int b;

    public B2(int x) {
        b = x;
    }

    public void printValues() {
        super.printValues();
        System.out.println("The child class's data: " + b);
    }
}

class second {
    public static void main(String[] args) {
        B2 obj = new B2(30);
        obj.printValues();
    }
}