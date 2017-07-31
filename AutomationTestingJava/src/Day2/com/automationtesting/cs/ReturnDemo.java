package Day2.com.automationtesting.cs;

public class ReturnDemo {

	public static void main(String[] args) {
		method1();
		// int j = method2(5);
		System.out.println("The j values is: " + method2(5, 10));
		System.out.println("The j values is: " + method3("Krishna", "Sakinala"));
		System.out.println("The j values is: " + method3("Selenium ", "WebDriver"));

	}

	public static void method1() {
		System.out.println("This is void block");
	}

	public static int method2(int i, int j) {

		int k = i + j;

		return k;
	}

	public static String method3(String firstName, String lastName) {

		String fullName = firstName + lastName;
		return fullName;
	}

}
