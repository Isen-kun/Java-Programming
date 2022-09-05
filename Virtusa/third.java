import java.io.*;
import java.util.Scanner;

class third {
    static int bit(int x) {
        int ans = 0;
        while (x > 0) {
            x /= 2;
            ans++;
        }

        return ans;
    }

    static boolean check(int d, int x) {
        if (bit(x / d) <= bit(d))
            return true;

        return false;
    }

    static int bs(int n) {
        int l = 1, r = (int) Math.sqrt(n);

        while (l < r) {
            int m = (l + r) / 2;
            if (check(m, n))
                r = m;
            else
                l = m + 1;
        }

        if (!check(l, n))
            return l + 1;

        else
            return l;
    }

    static int countDivisor(int n) {
        return n - bs(n) + 1;
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countDivisor(n));
    }
}