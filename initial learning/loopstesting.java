import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a[], b[], n[] = new int[t];
        for(int i=0;i<t;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            n[i] = in.nextInt();
        }
        in.close();
        
        for(int i=0;i<t;i++){
            for( int j=0; j<n[i]; j++){
                int sum;
                for(int k=0; k<=j; k++){
                    sum += Math.pow(2,k)*b[i];
                }
                System.out.print(a[i] + sum);
            }
            System.out.print("\n");
        }
    }
}
