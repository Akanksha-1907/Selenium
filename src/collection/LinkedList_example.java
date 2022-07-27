package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_example
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("Eye");
		l.add("Nose");
		l.add("Ear");
		l.add("Skin");
		l.add("Mouth");
		System.out.println(l);
		
		l.add(2, "Tongue");
		System.out.println(l);
		
		//Iterator Cursor
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

	
}
