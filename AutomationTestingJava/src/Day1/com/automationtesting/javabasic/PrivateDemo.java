package Day1.com.automationtesting.javabasic;

import Day1.com.automationtesting.dummy.ProtectedDemo;

public class PrivateDemo {

	private static int i = 15;
	String s = "selenium";

	public static void main(String[] args) {

		ProtectedDemo pDemo = new ProtectedDemo();
		// pDemo.

		PublicDemo publicDemo = new PublicDemo();
		PublicDemo.publicMethod();
		privateMethod();
	}

	private static void privateMethod() {

		System.out.println("The i value is: " + i);
	}

}
