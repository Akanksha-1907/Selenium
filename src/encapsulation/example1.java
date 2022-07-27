package encapsulation;

public class example1 
{
	//For encapsulation following are steps:
	//Step 1: variable declaration-> global and private.
	
	private String address;
	
	//Step 2: variable initialization-> constructor with public.
	
	public example1(String str)
	{
		address=str;
	}

	//Step 3:Utilize within a method with access level public.
	
	public void getaddress()
	{
		System.out.println(address);
	}

}
