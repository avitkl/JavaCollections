package CollectionConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcepts {
	public static void main(String[] args)
	{
		// It is similar to hashmap, but it is synchronized. Means only one Thread can access HashTable object hence it is Thread Safe
		// Stores the value on the basis of key and value
		// Each key is stored in the form of object and each object has unique HashCode(32 bit signed integer) and HashCode has value
		
		Hashtable h1 = new Hashtable();
        h1.put(1, "Tom");
        h1.put(2, "Test");
        h1.put(3, "Java");
        
        //Create a clone copy/shallow copy
        Hashtable h2= new Hashtable();        
		h2=(Hashtable)h1.clone();	
		System.out.println("The values from h1"+h1);
		System.out.println("The values from h1"+h2);
		
		h1.clear();
		System.out.println("The values from h1"+h1);
		System.out.println("The values from h1"+h2);
		
		//contains value:
		Hashtable h3 = new Hashtable();
		h3.put("A", "Avinash");
		h3.put("B", "Manager");
		h3.put("C", "Selenium");
		
		System.out.println("*********************************");
		if(h3.containsValue("Avinash"))
		{
			System.out.println("The value Avinash is found in hashtable");
		}
		
		//print all the values from hashtable using --Enumeration -- elements()
		System.out.println("*********************************");
		Enumeration e =h3.elements();
		System.out.println("Print values from h3 using Enumeration");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		// Get all the values from the hashtable using -- entrySet() -- set of hashtable values
		System.out.println("*********************************");
		System.out.println("Print values from h3 using entrySet");
		
		Set s = h3.entrySet();
		System.out.println(s);
		
		System.out.println("*********************************");
		Hashtable h4 = new Hashtable();
		h4.put("A", "Avinash");
		h4.put("B", "Manager");
		h4.put("C", "Selenium");
		
		//check both the hashtables are equal or not
		if(h3.equals(h4))
		{
			System.out.println("Both the hashtables are equal");
		}
		
		System.out.println("*********************************");
		//Get the value from key
		System.out.println(h3.get("A"));
		
		System.out.println("*********************************");
		//Get the hashcode of hashtable object
		System.out.println("Hash code value of h3:" + h3.hashCode());
		
		//no null key and null values
//		h3.put(null, "Tom"); Throw Exception
//		h3.put("A", null);
		
	}
	

}
