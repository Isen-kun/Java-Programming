interface Flying {
	int speed = 120;
	void printSpeed();
}

class Bird implements Flying{
	public Bird(String s){
		System.out.println("The bird of breed " + s + " flying at speed of " + speed + "kmph");
	}
	public void printSpeed(){
		System.out.println("The current speed is " + speed + "kmph");
	}
}

class Plane implements Flying{
	public Plane(String s){
		System.out.println("The model of the plane is " + s + " flying at the speed of " + speed + "kmph");
	}
	public void printSpeed(){
		System.out.println("The current speed is " + speed + "kmph");
	}
}

class second {
	public static void main(String args[]){
		Bird birb = new Bird("Woodpecker");
		Plane paper = new Plane("Boeing 747");
		birb.printSpeed();
	}
}
