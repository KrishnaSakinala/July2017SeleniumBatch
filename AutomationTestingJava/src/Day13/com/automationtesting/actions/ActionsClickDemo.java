package Day13.com.automationtesting.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement submitButton = driver.findElement(By.xpath("//*[@id='submitbtn']"));
		Actions action = new Actions(driver);
		action.moveToElement(submitButton).click().perform();
		
		// count the number of elements
		int anchorTagsCount = driver.findElements(By.xpath("//button")).size();
		System.out.println("Total Number of links: "+ anchorTagsCount);
		
		
	}

}
