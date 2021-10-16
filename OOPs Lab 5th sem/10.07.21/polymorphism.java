class polymorphism{
	void area(int r){
		System.out.println("The area of the circle is: " + 3.14*r*r);
	}

	void area(int s, char ch){
		System.out.println("The area of the square is:  " + s*s);
	}

	void area(int l, int b){
		System.out.println("The area of the rectangle is: " + l*b);
	}

	void area(int b, int h, char ch){
		System.out.println("The area of the triangle is: " + 0.5*b*b);
	}

	public static void main(String args[]){
		polymorphism circle = new polymorphism();
		polymorphism square = new polymorphism();
		polymorphism rectangle = new polymorphism();
		polymorphism triangle = new polymorphism();

		circle.area(5);
		square.area(10, ' ');
		rectangle.area(5, 7);
		triangle.area(9, 11, ' ');
	}
}
