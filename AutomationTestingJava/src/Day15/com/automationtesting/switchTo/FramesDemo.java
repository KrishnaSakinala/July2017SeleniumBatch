package Day15.com.automationtesting.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		// Using WebElement
		//WebElement frame = driver.findElement(By.xpath("//*[@id='Single']/iframe"));
		//driver.switchTo().frame(frame);
		
		// Using Index
		driver.switchTo().frame(0);
		
		WebElement textBox = driver.findElement(By.xpath("html/body/section/div/div/div/input"));
		textBox.sendKeys("Selenium");

		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		WebElement secondTab = driver.findElement(By.xpath("html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		secondTab.click();
	}
}
