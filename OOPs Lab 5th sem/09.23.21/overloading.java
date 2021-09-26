class overloading 
{
	public void area(int r)
	{
		double ar;
		ar = 3.14*r*r;
		System.out.println("The area of the circle is: " + ar);
	}
	public void area(int s, char ch)
	{
		double ar;
		ar = s*s;
		System.out.println("The area of the square is: "+ ar);
	}
	public void area(int l, int b)
	{
		double ar;
		ar = l*b;
		System.out.println("The area of the square is: "+ ar);
	}
	public static void main(String args[])
	{
		int side=5, radius=7, length=9, breadth=12;
		overloading obj = new overloading();
		obj.area(radius);
		obj.area(side, ' ');
		obj.area(length, breadth);
	}
}


