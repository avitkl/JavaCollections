package CollectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {
	
	public static void main(String[] args)
	{
		// HashMap is a class implements Map Interface
		// Extends AbstractMap
		// It contains only unique elements
		// stores the values in the form of Key - Value Pair
		// it may have one null key and multiple null values
		// it maintains no order
		// HashMap is non synchronized,means at a time multiple threads can access HashMap object hence performance will be more--not a thread safe
		// Concurrent modification exception -- Fail - Fast condition
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "Javascript");
		hm.put(4, "RFT");
		
		//System.out.println(hm.get(1));
		//System.out.println(hm.get(5)); // it will give u null as value
		
		System.out.println("Print all the data");
		for(Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
		System.out.println("*****************************************");
		System.out.println("Print all the values before removing value");
		System.out.println(hm);
		
		hm.remove(3);
		
		System.out.println("*****************************************");
		System.out.println("Print all the values after removing value");
		System.out.println(hm);
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 =new Employee("Tom",25,"Admin");
		Employee e2 =new Employee("Peter",26,"QA");
		Employee e3 =new Employee("Stev",27,"Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		System.out.println("*****************************************");
		System.out.println("Printing employee data stored in employee object");
		for(Entry<Integer,Employee> m:emp.entrySet())
		{
			int key=m.getKey();
			Employee e =m.getValue();
			System.out.println("Employee "+ key + " Info");			
			System.out.println(e.name +" "+e.age +" "+e.dept);
			
		}
		
	}

}
