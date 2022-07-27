package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Removeduplicateelement_linkedhashset
{
	public static void main(String[] args)
	{
		int []num= {20,75,96,42,20,78,75,42,63,31,76};
		
		ArrayList <Integer>al=new ArrayList<Integer>();
		for(int i=0;i<=num.length-1;i++)
		{
			al.add(num[i]);
		}
		System.out.println(al);
		LinkedHashSet<Integer> lsh=new LinkedHashSet<Integer>(al);
		System.out.println(lsh);
		
	}

}
