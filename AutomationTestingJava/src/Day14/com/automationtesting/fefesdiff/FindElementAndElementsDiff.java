package Day14.com.automationtesting.fefesdiff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndElementsDiff {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		List<WebElement> buttons = driver.findElements(By.xpath("//*[@id='submitb']"));
		int buttonCount = buttons.size();
		System.out.println("Total Number of Buttons: "+ buttonCount);
		
		WebElement submitButton = driver.findElement(By.xpath("//*[@id='submitb']"));
		submitButton.click();
	}
}
