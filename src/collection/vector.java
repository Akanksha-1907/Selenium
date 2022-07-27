package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("Marigold");
		v.add(235);
		v.add(null);
		v.add(78.25);
		v.add("Daisy");
		v.add("Daffodil");
		v.add("Daisy");
		v.add(null);
		System.out.println(v);
		System.out.println(v.get(2));   //we can retrive the value by using index
		
		//System.out.println(v.isEmpty()); //method is used to check whether the vector is empty or not
		
		v.remove(null);                //remove the value from the vector
		System.out.println(v);
		
		System.out.println(v.indexOf("Daisy"));   //gives the index of the particular element.
		System.out.println(v.lastIndexOf("Daisy"));   //gives the index of the element from the last but counts from start.
		
		//Print elements using Enumeration cursor
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//Print elements using Iterator cursor
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//Print elements using ListIterator cursor
		ListIterator li=v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		//Used to clear the Vector
		v.clear();
		System.out.println(v);
		
		
	}

}
