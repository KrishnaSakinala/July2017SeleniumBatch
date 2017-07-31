package Day1.com.automationtesting.dummy;

public class ProtectedDemo {

	// protected static int i = 10;
	protected static String s = "selenium";

	public static void main(String[] args) {
		protectedMethod();
	}

	protected static void protectedMethod() {

		System.out.println("The String value is: " + s);
	}

}
