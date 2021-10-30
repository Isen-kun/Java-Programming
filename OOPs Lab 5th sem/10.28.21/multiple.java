interface intf1 {
	String cons1 = "Constant 1";
	void print1();
}

interface intf2 {
	String cons2 = "Constant 2";
	void print2();
}

class multiple implements intf1, intf2 {
	public void print1(){
		System.out.println("Invoking the first function");
	}

	public void print2(){
		System.out.println("Invoking the second function");
	}

	public static void main(String args[]){
		multiple obj = new multiple();
		System.out.println(obj.cons1);
		obj.print1();
		System.out.println(obj.cons2);
		obj.print2();
	}
}


