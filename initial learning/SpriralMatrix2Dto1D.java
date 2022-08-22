import java.util.Scanner;

public class SpriralMatrix2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rs = 0, re = m - 1, cs = 0, ce = n - 1;
        while (rs <= re && cs <= ce) {
            for (int j = cs; j <= ce; j++) {
                System.out.print(arr[rs][j] + " ");
            }
            rs++;

            for (int i = rs; i <= re; i++) {
                System.out.print(arr[i][ce] + " ");
            }
            ce--;

            for (int j = ce; j >= cs; j--) {
                System.out.print(arr[re][j] + " ");
            }
            re--;

            for (int i = re; i >= rs; i--) {
                System.out.print(arr[i][cs] + " ");
            }
            cs++;
        }
        System.out.println();
        sc.close();
    }
}