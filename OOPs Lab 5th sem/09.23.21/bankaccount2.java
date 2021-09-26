class BankAccount
{
 	String name;
 	float amount;

 	public void setValue(String nm,float amt)
 	{
  		name = nm;
  		amount = amt;
 	}

 	public void depositAmount(float amt)
 	{
  		System.out.println("\n Previous Account Balance is: " + amount);
  		System.out.println("\n Deposition Amount is: "+ amt);
  		amount = amount+amt;
  		System.out.println("\n After Deposition: " + amount);
 	}
 
 	public void withdrawlAmount(float amt)
 	{
  		System.out.println("\n Previous Account Balance is: " + amount);
  		System.out.println("\n Withdrawl Amount is: "+ amt);
  		if(amount<amt)
  		{
   			System.out.println("\n Insufficient Balance!");
  		}
  		else
  		{
   			amount=amount-amt;
   			System.out.println("\n After Withdrawl: " + amount);
  		}
 	}
 	public void getValue()
 	{
  		System.out.println("\n Name of the account holder: " + name);
  		System.out.println("\n Account Balance reamaining: " + amount);
 	}
  	public static void main(String args[])
  	{
   		BankAccount obj1=new BankAccount();
   		obj1.setValue("Iida", 4590.0f);
   		obj1.getValue();
   		obj1.depositAmount(14561.50f);
   		obj1.withdrawlAmount(2224.50f);
   		obj1.depositAmount(5000);
   		obj1.withdrawlAmount(12007);
  	}	
}
