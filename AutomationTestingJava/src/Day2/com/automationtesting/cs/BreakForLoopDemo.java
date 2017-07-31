package Day2.com.automationtesting.cs;

public class BreakForLoopDemo {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			System.out.println("The value of i is: " + i);

			if (i == 50) {
				break;
			}
		}

	}

}
