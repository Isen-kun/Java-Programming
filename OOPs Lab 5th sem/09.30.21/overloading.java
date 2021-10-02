class shapes{
	int sides;
	String name;
	
	public shapes(){
		sides = 0;
		name = "Circle";
	}

	public shapes(int s){
		sides = s;
	}

	public shapes(String n){
		name = n;
	}

	public shapes(int s, String n){
		sides = s;
		name = n;
	}

	public void getValue(){
		System.out.println("\nThe name of the shape is: " + name);
		System.out.println("The number of sides of the shape is: " + sides);
	}

	public static void main(String args[]){
		shapes ob1 = new shapes();
		shapes ob2 = new shapes(4);
		shapes ob3 = new shapes("Triangle");
		shapes ob4 = new shapes(6, "Hexagon");

		ob1.getValue();
		ob2.getValue();
		ob3.getValue();
		ob4.getValue();
	}
}
