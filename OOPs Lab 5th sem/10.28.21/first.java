interface student {
	String name = "Rajorshi Ghosh";
	int age = 19;
	void printDetails();
}

class marks implements student{
	int Physics, Chemistry, Maths;
	double pert;
	public marks (int P, int C, int M) {
		Physics = P;
		Chemistry = C;
		Maths = M;
	}
	public void calculatePercentage() {
		pert = (Physics+Chemistry+Maths)/3.0;
		System.out.println("The average marks percentage is " + pert);
	}
	public void printDetails(){
		System.out.println("The name of the student is " + name + " and is of age " + age);
	}
}

class sports implements student{
	int runs, wickets, overs;
	double rpo, wpo;
	public sports (int R, int W, int O){
		runs = R;
		wickets = W;
		overs = O;
	}
	public void calculateAverage(){
		rpo = (float)runs/overs;
		wpo = (float)wickets/overs;
		System.out.println("The runs per over of the student is " + rpo + " and wickets per over is " + wpo);
	}
	public void printDetails(){
		System.out.println("The name of the student is " + name + " and is of age " + age);
	}
}

class first{
	public static void main(String args[]){
		marks mark = new marks(90,95,90);
		sports sport = new sports(123,5,10);
		mark.printDetails();
		mark.calculatePercentage();
		sport.calculateAverage();
		
	}
}
