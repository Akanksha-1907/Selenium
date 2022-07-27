package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_methods_hetero 
{
	public static void main(String[] args) 
	{
		//Create an object ofArrayList
		ArrayList a=new ArrayList();
		
		//Method 1--->a.add();-->Insert element in ArrayList--->Heterogeneous Example
		a.add(5.8);
		a.add("Ashu");
		a.add(500);
		a.add(5.8);
		a.add("Hedaoo");
		a.add('A');
		a.add(780);
		System.out.println(a);
		System.out.println("-----------------------------------");
		
		//Suppose we want to add element in index 3---->it will add the element then remaining elements will shift to the right
		a.add(3, "Shimmer");
		System.out.println(a);
		System.out.println("-----------------------------------");
		
		//Add the two ArrayList
		ArrayList a1=new ArrayList();
		a1.add(852);
		a1.add(8.2);
		a1.add("Sweet");
		a1.add('T');
		a1.add(8.2);
		
		a.addAll(a1);
		System.out.println(a);
		System.out.println("-----------------------------------");
		a.addAll(2, a1);   //it will add a1 arraylist from index 2
		System.out.println(a);
		System.out.println("-----------------------------------");
		
		//Method 2--->a.remove();--->delete the element
		a.remove("Ashu");
		System.out.println(a);
		System.out.println("-----------------------------------");
		
		//Method 3-->a.set();---->Replace value of element
		a.set(1, "Pihu");
		System.out.println(a);
		System.out.println("-----------------------------------");
		
		//Method 4--->a.size();----->Get the size of the arraylist
		System.out.println(a.size());
		System.out.println("-----------------------------------");
		
		//Fetch the element of array using for loop
		for(int i=0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("-----------------------------------");
		
		//Fetch the element of array using for each loop
		for(Object o:a)
		{
			System.out.println(o);
		}
		System.out.println("-----------------------------------");
		
		//Fetch the element of array using Iterator Cursor----->only goes forward
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("-----------------------------------");
		
		//Fetch the element of array using ListIterator Cursor---->works forward and backward
		ListIterator b=a.listIterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
		while(b.hasPrevious())
		{
			System.out.println(b.previous());
		}
		System.out.println("-----------------------------------");
		
		//Method 5--->a.contains(value);
		boolean r=a.contains("Hedaoo");
		System.out.println(r);
		
		
		
	}
	

}
