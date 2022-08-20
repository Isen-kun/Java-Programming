import java.util.Scanner;

public class RevDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int rem;

        while (n > 0) {
            rem = n % 10;
            n /= 10;
            num *= 10;
            num += rem;
        }
        System.out.println(num);
        sc.close();
    }
}
