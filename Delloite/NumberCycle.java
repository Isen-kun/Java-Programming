import java.util.Scanner;

public class NumberCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int originalNum = N;
        int temp;
        do {
            temp = N % 10;  // take the first digit
            N = N / 10;   // remove the first digit
            N = N + temp * (int) Math.pow(10, String.valueOf(N).length()); // append the first digit to the end
            if(N!=originalNum){
                System.out.print(N + " ");
            }
        } while (N != originalNum);
    }
}