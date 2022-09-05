import java.io.*;
import java.util.Scanner;

class Res {
    static String max = "";
}

class fourth {
    public static void findMaximumNum(char ar[], int k, Res r) {
        if (k == 0)
            return;
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[j] > ar[i]) {
                    char temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                    String st = new String(ar);

                    if (r.max.compareTo(st) < 0) {
                        r.max = st;
                    }

                    findMaximumNum(ar, k - 1, r);

                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        Res r = new Res();
        r.max = str;
        findMaximumNum(str.toCharArray(), k, r);
        System.out.println(r.max);
    }
}
