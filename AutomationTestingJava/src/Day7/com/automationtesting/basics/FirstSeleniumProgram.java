package Day7.com.automationtesting.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationtesting.in/");
		
		WebElement emailTextbox = driver.findElement(By.cssSelector("#email"));
		emailTextbox.sendKeys("abcd@yahoo.com");
		
		WebElement  buttonNavigateToRegister = driver.findElement(By.id("enterimg"));
		buttonNavigateToRegister.click();
	}
}
