package CollectionConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {

		
		LinkedList<String> ll =new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
//		//print
		System.out.println("contents of the linkedlist:"+ll);
//		//addfirst
		ll.addFirst("Avinash");
		ll.addLast("Automation");
		System.out.println("contents of the linkedlist:"+ll);
		
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0,"Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents of the linkedlist:"+ll);
		
		ll.remove(2);
		System.out.println("contents of the linkedlist:"+ll);
		
		//How to print all the values of LinkedList
		//1. for loop
		
		System.out.println("*****Using for loop");
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		//2. Advanced for loop
		
		System.out.println("*****Using for advanced for loop");
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		//3. iterator
		System.out.println("*****Using iterator");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("*****Using while loop");
		//4. while loop
        int num=0;
        while(ll.size()>num)
        {
        	System.out.println(ll.get(num));
        	num++;
        }
	}

}
