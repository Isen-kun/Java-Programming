import java.util.*;

class decimal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b, cnt=0;
		System.out.println("Enter a decimal number: ");
		a = sc.nextInt();
		b = a;
		for(; a!=0; a/=2, cnt++);
		int ar[] = new int[cnt];
		for(int i =0; b!=0;b/=2, i++){
			ar[i] = b%2;
		}
		System.out.println("The equivalent binary number is: ");
		for(int i=cnt-1; i>=0; i--){
			System.out.print(ar[i] + " ");
		}
	}
}
