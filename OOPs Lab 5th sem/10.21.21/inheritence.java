class A {
	public int a = 10;

	public void printValue(){
		System.out.println("A's data = " + a);
	}
}

class B extends A {
	public int b = 20;

	public void printValue() {
		super.printValue();
		System.out.println("B's data = " + b);
	}
}

class C extends B {
	public int c = 30;

	public void printValue() {
		super.printValue();
		System.out.println("C's data = " + c);
	}

	public void changeValue(int x, int y, int z){
		a = x;
		b = y;
		c = z;
	}
}

class inheritence {
	public static void main(String args[]){
		C obj = new C();
		System.out.println("Old data in the classes: ");
		obj.printValue();
		
		obj.changeValue(50, 60, 70);
		System.out.println("\nNew data in the classes: ");
		obj.printValue();
		
	}
}
