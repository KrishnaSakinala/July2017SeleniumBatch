package Day3.com.automationtesting.oops;

public class Honda extends Bike{

	public void run() {
		System.out.println("Honda vehicle...");
	}
	
	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();
		
	}
}
