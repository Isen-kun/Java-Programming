class prime
{
	public static void main(String args[])
	{
		int k = 19;
		boolean flag = true;
		for(int i=2; i<k/2; i++)
		{
			if(k%i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(k + " is a Prime Number");
		}
		else
		{
			System.out.println(k + " is NOT a Prime Number");
		}
	}
}
