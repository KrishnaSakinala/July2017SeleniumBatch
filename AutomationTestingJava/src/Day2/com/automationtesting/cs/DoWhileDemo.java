package Day2.com.automationtesting.cs;

public class DoWhileDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Initial value of a is: " + a);
		System.out.println("Initial value of b is: " + b);

		do {
			a = a + b;
			b = b + 10;

			System.out.println("value of a is: " + a);
			System.out.println("value of b is: " + b);

		} while (a <= 100);
	}
}
