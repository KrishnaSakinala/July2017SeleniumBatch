package Day4.com.automationtesting.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> il = new HashSet<Integer>();
		
		// adding values
		il.add(1);
		il.add(2);
		il.add(3);
		il.add(4);
		il.add(5);
		
		System.out.println(il);
		
		for (Integer integer : il) {
			System.out.println(integer);
		}
		
		il.add(2);
		
		System.out.println("*********");
		for (Integer integer : il) {
			System.out.println(integer);
		}
		
		System.out.println("****Using Iterator*****");
		
		Iterator<Integer> it = il.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
