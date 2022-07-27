package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_example
{
	public static void main(String[] args)
	{
		//Here the sequence is not maintained of insertion
		//Duplicate values are not allowed.
		//Only one null value can be present.
		HashSet h=new HashSet();
		h.add("Digambar");
		h.add("Object");
		h.add(8697456);
		h.add("Object");    //it will ignore the value
		h.add(8697456);
		h.add(null);        //it will ignore the value
		h.add(null);
		
		System.out.println(h);
		
		h.remove("Object");     //removes the value
		System.out.println(h);
		
		//Print the LinkedList using Iterator
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//Print the LinkedList using for each loop
		for(Object o:h)
		{
			System.out.println(o);
		}
}

}



