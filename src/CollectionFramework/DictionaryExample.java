package CollectionFramework;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dictionary<String,Double> list=new Hashtable<String, Double>();
		
		list.put("Emp001", 200000.00);
		list.put("Emp002", 400000.00);
		list.put("Emp003", 700000.00);
		
		
		System.out.println("salary of emp 3 " +list.get("Emp003"));
		
		
		

	}

}
