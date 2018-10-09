package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcepts {

	public static <E> void main(String[] args) {

		int a[] = new int[3];  //static array --size is fixed
		
		//dynamic array -- ArrayList
		//Properties of ArrayList
		//1. Can contain duplicate values/elements
		//2  Maintain insertion order
		//3. It is not Synchronized
		//4. Allows random access to fetch the element because it stores the values on the basis of indexes
		
		//Non generic Array
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2		
		System.out.println(ar.size());  //size of arrayList
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add(12.33);
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		
		System.out.println(ar.size()); //size of arrayList
		
		System.out.println(ar.get(4)); //to get the value from an index
		
		//To Print all the values from the arraylist :
		//1. for loop
		//2. using iterator
		
		System.out.println("*****Print values using for loop");
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Generic Array
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Selenium"); Will not allow to store any data except integer
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Selenium");
		
		ArrayList<E> ar3=new ArrayList<E>(); //Represent if you are not sure what type of data to store
		
		//Employee class objects
		Employee e1=new Employee("Avinash",27,"QA");
		Employee e2=new Employee("Tom",28,"Dev");
		Employee e3=new Employee("Peter",29,"Admin");
		
		//Create arraylist
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		System.out.println("*****Print values using iterator");
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("*********************");
		//************************
		//addAll()
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("Selenium");
		ar5.add("Java");
		ar5.add("QTP");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("dev");
		ar6.add("QA");
		ar6.add("Javascript");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*********************");
		
		
		//removeAll
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*********************");
		
		//retainAll()
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("A");
		ar7.add("B");
		ar7.add("C");
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("E");
		ar8.add("A");
		ar8.add("G");
		
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
		}
		
		
	}

}
