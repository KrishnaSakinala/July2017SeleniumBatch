package Day3.com.automationtesting.oops;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println(add(2,3));
		System.out.println(add(2,4,10));
	}
	
	public static int add(int a, int b) {
		return (a+b);
	}
	
	public static int add(int d, int c, int e)
	{
		return  (d+c+e);
	}
	
	public static String add(String a, int b) {
		return "";
	}

}
