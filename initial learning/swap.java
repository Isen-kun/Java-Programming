import java.util.*;

class swap {
    int reference(Main obj) {
        int temp;
        temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("Values after swapping");
        System.out.println("A = " + obj.a);
        System.out.println("B = " + obj.b);
        return 0;
    }
 }

 class Main {
    void main() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        swap obj = new swap();
	Main obj2 = new Main();
        obj.reference(obj2);
        System.out.println("Inside main ->");
        System.out.println("A = " + a + "\nB = " + b);
    }
}
