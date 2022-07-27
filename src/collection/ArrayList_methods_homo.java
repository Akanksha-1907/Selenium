package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_methods_homo 
{
	public static void main(String[] args) 
	{
		//Create ArrayList of generic type--->Homogeneous type
		ArrayList <String> a1=new <String>ArrayList();
		//ArrayList <Integer> a2=new <Integer>ArrayList();
		a1.add("Discuss");
		a1.add("Divide");
		a1.add("Descend");
		a1.add("Distrupt");
		a1.add("Devast");
		System.out.println(a1);
		
		//add element in the arraylist
		a1.add(1,"Duplicate");
		System.out.println(a1);
		
		ArrayList <String> a2=new <String>ArrayList();
		a2.add("Super");
		a2.add("Sweet");
		a2.add("Shallow");
		a2.add("Sour");
		a2.add("Shimmer");
		
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(a2);
		System.out.println(a1);
		
		a1.remove("Divide");
		System.out.println(a1);
		
		a1.set(0, "Different");
		System.out.println(a1);
		
		System.out.println(a1.size());
		
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		
		//Fetch the element of array using for each loop
		for(Object o:a1)
		{
			System.out.println(o);
		}
		
		//Fetch the element of array using Iterator Cursor----->only goes forward
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//Fetch the element of array using ListIterator Cursor---->works forward and backward
		ListIterator b=a1.listIterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
		while(b.hasPrevious())
		{
			System.out.println(b.previous());
		}
		
		//Method 5--->a.contains(value);
		boolean r=a1.contains("Sour");
		System.out.println(r);
		
		
		
		
		
		

	}

}
