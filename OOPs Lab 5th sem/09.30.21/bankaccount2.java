class BankAccount
{
 	String name;
 	float amount;

	public BankAccount()
	{
		name = "Default name";
		amount = 0.0f;
	}

	public BankAccount(String n)
	{
		name = n;
	}

	public BankAccount(float a)
	{
		amount = a;
	}

	public BankAccount(String n, float a)
	{
		name = n;
		amount = a;
	}

	
	public void setValue(String n)
	{
		name = n;
	}

	public void setValue(float a)
	{
		amount = a;
	}

 	public void setValue(String nm,float amt)
 	{
  		name = nm;
  		amount = amt;
 	}

	public void getValue()
	{
		System.out.println("\nThe name of the account holder is: " + name);
		System.out.println("The amount present in the account is: " + amount);
	}


  	public static void main(String args[])
  	{
   		BankAccount obj1 = new BankAccount();
		BankAccount obj2 = new BankAccount("Abc");
		BankAccount obj3 = new BankAccount(46897.0f);
		BankAccount obj4 = new BankAccount("Def", 442078.0f);

		obj1.getValue();
		obj2.getValue();
		obj3.getValue();
		obj4.getValue();

		obj1.setValue("Ghi", 79941.0f);
		obj2.setValue(7941.0f);
		obj3.setValue("Xyz");

		System.out.println("\n\nThe aftermath: ");

		obj1.getValue();
		obj2.getValue();
		obj3.getValue();
	}
}
