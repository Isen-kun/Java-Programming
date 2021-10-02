import java.util.*;

class simpleArray {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int [10];
		for(int i=0; i<10;i++){
			ar[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++){
			System.out.print(ar[i] + " ");
		}

	}
	
}
