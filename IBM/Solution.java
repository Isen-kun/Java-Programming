import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print(minChocolates(a, n));
    }

    public static int minChocolates(int[] a, int n) {
        int i = 0, j = 0;
        int res = 0, val = 1;

        while (j < n - 1) {

            if (a[j] > a[j + 1]) {
                j += 1;
                continue;
            }

            if (i == j)
                res += val;
            else {
                res += get_sum(val, i, j);
                val = 1;
            }

            if (a[j] < a[j + 1])
                val += 1;
            else
                val = 1;

            j += 1;
            i = j;
        }

        if (i == j)
            res += val;
        else
            res += get_sum(val, i, j);

        return res;
    }

    public static int get_sum(int peak, int start, int end) {
        int count = end - start + 1;
        peak = (peak > count) ? peak : count;
        int s = peak + (((count - 1) * count) >> 1);
        return s;
    }

}
