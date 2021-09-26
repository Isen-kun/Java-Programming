import java.util.*;

class Home{
	public static void main(String args[]){
		System.out.println("Enter a number and a string:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String str = scan.next();
		scan.close();
		System.out.println("The inputted number and string are:");
		System.out.println(a);
		System.out.println(str);
	}
}
