public class test {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            
            System.out.println("");
        }
    }
}