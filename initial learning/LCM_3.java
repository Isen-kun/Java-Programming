import java.util.Scanner;

public class LCM_3 {

    public static long lcm(int[] element_array) {
        long a = 1;
        int d = 2;

        while (true) {
            int c = 0;
            boolean v = false;

            for (int i = 0; i < element_array.length; i++) {
                if (element_array[i] == 0) {
                    return 0;
                } else if (element_array[i] < 0) {
                    element_array[i] = element_array[i] * (-1);
                }
                if (element_array[i] == 1) {
                    c++;
                }
                if (element_array[i] % d == 0) {
                    v = true;
                    element_array[i] = element_array[i] / d;
                }
            }
            if (v) {
                a = a * d;
            } else {
                d++;
            }
            if (c == element_array.length) {
                return a;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lcm(arr));
        sc.close();
    }
}