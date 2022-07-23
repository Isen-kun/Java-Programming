import java.util.Scanner;

class CA {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        str = scan.next();
        scan.close();
        long len = str.length();
        long p = 0, q = 0, r = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'G') {
                r++;
                if (i % 2 != 0) {
                    p++;
                } else {
                    q++;
                }
            }
        }
        if (len % 2 == 0) {
            System.out.print(Math.min(r - p, r - q));
        } else {
            if (r == len / 2) {
                System.out.print(r - p);
            } else {
                System.out.print(len / 2 + 1 - q);
            }
        }
    }
}