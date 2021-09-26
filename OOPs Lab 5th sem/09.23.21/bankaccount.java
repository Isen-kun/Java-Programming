class bankaccount
{
 	String name;
 	float amount;

 	public void setValue(String nm, float amt)
 	{
  		name = nm;
  		amount = amt;
 	}

 	public void getValue()
 	{
  		System.out.println("\nName of the account holder: " + name);
  		System.out.println("Amount present in the account: " + amount);
 	}
 
 	public static void main(String args[])
 	{
  	bankaccount obj1 = new bankaccount();
  	obj1.setValue("Hiro",8456);
  	bankaccount obj2 = new bankaccount();
  	obj2.setValue("Yuki",9136.50f);
  	bankaccount obj3 = new bankaccount();
  	obj3.setValue("Take",10000);
 
  	obj1.getValue();
  	obj2.getValue();
  	obj3.getValue();
 	}
}
