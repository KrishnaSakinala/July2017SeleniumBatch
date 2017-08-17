package Day7.com.automationtesting.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://automationtesting.in/");

		/*
		 * WebElement emailTextbox = driver.findElement(By.cssSelector("#email"));
		 * emailTextbox.sendKeys("abcd@yahoo.com");
		 * 
		 * WebElement buttonNavigateToRegister = driver.findElement(By.id("enterimg"));
		 * buttonNavigateToRegister.click();
		 */
	}
}
