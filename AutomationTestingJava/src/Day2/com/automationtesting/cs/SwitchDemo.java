package Day2.com.automationtesting.cs;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Country value: ");
		int country = sc.nextInt();

		switch (country) {
		case 1:
			System.out.println("India");
			break;

		case 2:
			System.out.println("USA");
			break;

		case 3:
			System.out.println("UK");
			break;

		case 4:
			System.out.println("Australia");
			break;

		default:
			System.out.println("No Country used");
			break;
		}

	}

}
