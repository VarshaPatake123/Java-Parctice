package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList can store element of specified data types, unlike array size of ArrayList is not fixed
		// ArrayList element stored in continious memory location
		
		ArrayList<String> list=new ArrayList<String>();
		
		//adding elements to array list
		list.add("BMW");
		list.add("Audi");
		list.add("Honda");
		
		System.out.println(list);
		
		//adding elements using index
		list.add(3,"Jupiter");
		list.add(1,"cycle");
		
		System.out.println(list);
		

		//print elements by using for loop
		System.out.println("print elements using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//print elements using iterator
		System.out.println("Print element using iterator");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//print elements using advance for loop
		System.out.println("print elements using advance for loop");
		for(String element: list)
		{
			System.out.println(element);
		}
	}

}
