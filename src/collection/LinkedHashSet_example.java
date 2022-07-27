package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_example 
{
	public static void main(String[] args) 
	{
		//Create LinkedHashSet of heterogeneous
		LinkedHashSet lsh=new LinkedHashSet();
		
		//Adding elements
		//does not allow duplicate value
		//only one null value is allowed
		
		lsh.add("Ashu");
		lsh.add(03);
		lsh.add("Keechu");
		lsh.add(1.9f);
		lsh.add(03);   //ignore
		lsh.add(null);
		lsh.add("Baku");
		lsh.add(null);
		System.out.println(lsh);
		System.out.println(lsh.size());
		
		lsh.add("Pink");
		System.out.println(lsh);
		
		Iterator i=lsh.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//Removing Elements
		lsh.remove(null);
		System.out.println(lsh);
		
		System.out.println(lsh.isEmpty());
		System.out.println(lsh.contains("Baku"));
		
		
	}

}
