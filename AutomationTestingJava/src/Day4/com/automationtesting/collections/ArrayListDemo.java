package Day4.com.automationtesting.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
			
		ArrayList<Integer> il = new ArrayList<Integer>();
		
		// adding values to list
		il.add(1);
		il.add(2);
		il.add(3);
		il.add(4);
		il.add(5);
		
		// printing list
		System.out.println(il);
		System.out.println("Integer Array list size: " + il.size());
		
		il.add(100);
		System.out.println(il);
		System.out.println("Integer Array list size: " + il.size());
		
		ArrayList<String> sl = new ArrayList<String>();
		
		sl.add("selenium");
		sl.add("web");
		sl.add("driver");
		
		System.out.println(sl);
		System.out.println("String Array list size: " + sl.size());
		
		// checking value exist or not?
		System.out.println(il.contains(10));
		
		// remove element
		il.remove(5);
		System.out.println(il);
		
		il.add(1);
		il.add(2);
		il.add(3);
		il.add(4);
		il.add(5);
		
		System.out.println(il);
		
		// accessing or getting element from the list using index
		System.out.println(il.get(2));
		
		/*System.out.println("*** Using for loop ***");
		
		for(int i=0; i<il.size(); i++) {
			System.out.println(il.get(i));
		}*/
		
		System.out.println("*** Using foreach loop ***");
		
		for(Integer i : il) {
			System.out.println(il.get(i));
		}
		
		System.out.println("*** Using foreach loop ***");
		
		for (String s : sl) {
			System.out.println(s);
		}
		
		// using iterator
		System.out.println("*** Using Iterator ***");
		
		Iterator<Integer> it = il.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
