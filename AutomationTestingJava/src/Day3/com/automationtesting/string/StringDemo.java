package Day3.com.automationtesting.string;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "a b";
		
		System.out.println(str.length());
		System.out.println(str.equals("Selenium"));
		System.out.println(str.trim());
		System.out.println(str.contains("selenium"));
		System.out.println(str.concat(" class"));
		System.out.println(str.endsWith("um"));
		System.out.println(str.startsWith("T"));
		System.out.println(str.indexOf("s"));
		System.out.println(str.equalsIgnoreCase("Selenium"));
		System.out.println(str.replace(" ", ""));
		
	}

}
