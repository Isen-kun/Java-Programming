import java.util.Scanner;

public class solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int spc = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spc++;
            }
        }

        String arr[] = new String[spc + 1];
        int lsum = 0;
        arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == '0' || arr[i].charAt(0) == '1' || arr[i].charAt(0) == '2' || arr[i].charAt(0) == '3'
                    || arr[i].charAt(0) == '4' || arr[i].charAt(0) == '5' || arr[i].charAt(0) == '6'
                    || arr[i].charAt(0) == '7' || arr[i].charAt(0) == '8' || arr[i].charAt(0) == '9') {
                lsum += Integer.parseInt(String.valueOf(arr[i].charAt(arr[i].length() - 1)));
            }
        }
        if (lsum == 0) {
            System.out.println(-1);
            return;
        }
        if (isPrime(lsum)) {
            System.out.println(lsum);
            return;
        }

        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(lsum));
        if (isPrime(Integer.parseInt(String.valueOf(str.reverse())))) {
            System.out.println(str);
            return;
        }
        System.out.println(factors(Integer.parseInt(String.valueOf(str))));

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factors(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}