interface Flying {
	int speed = 120;
	void printSpeed();
}

interface A {
	void useLessFunc();
}

class Bird implements Flying,A{
	public Bird(String s){
		System.out.println("The bird of breed " + s + " flying at speed of " + speed + "kmph");
	}
	public void printSpeed(){
		System.out.println("The current speed is " + speed + "kmph");
	}
	public void useLessFunc(){
		System.out.println("Forcefully written function");
	}
}

class Plane implements Flying,A{
	public Plane(String s){
		System.out.println("The model of the plane is " + s + " flying at the speed of " + speed + "kmph");
	}
	public void printSpeed(){
		System.out.println("The current speed is " + speed + "kmph");
	}
	public void useLessFunc(){
		System.out.println("Forcefully written function");
	}
}

class third {
	public static void main(String args[]){
		Bird birb = new Bird("Woodpecker");
		Plane paper = new Plane("Boeing 747");
		birb.printSpeed();
		paper.useLessFunc();
	}
}
