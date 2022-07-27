package collection;

import java.util.TreeSet;

public class TreeSet_example
{
	public static void main(String[] args) 
	{
		//Homogeneous in nature
		//print in ascending order
		
		TreeSet ts=new TreeSet();
		ts.add("Eagle");
		ts.add("Peacock");
		ts.add("Sparrow");
		ts.add("Woodpecker");
		ts.add("Hornbill");
		
		System.out.println(ts);
		
		//Print in descending Order
		System.out.println(ts.descendingSet());
		
		
		ts.remove("Eagle");
		System.out.println(ts);
	}

}
