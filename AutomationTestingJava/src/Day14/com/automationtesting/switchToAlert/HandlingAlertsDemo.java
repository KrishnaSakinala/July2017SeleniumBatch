package Day14.com.automationtesting.switchToAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlertsDemo {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/KRISHNA VOLUME/drivers/chromedriver");
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alertBoxButton = driver.findElement(By.cssSelector(".btn.btn-danger"));
		alertBoxButton.click();
		
		Thread.sleep(5000);
		
		// Clicking on OK button which is having only one (OK) button.
		Alert alt = driver.switchTo().alert();
		alt.accept(); // it will click on OK button
		
		// Clicking on CANCEL Button
		WebElement alertWithOKCancelLeftButton = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertWithOKCancelLeftButton.click();
		
		WebElement alertWithOKCancelButton = driver.findElement(By.xpath("//*[@id='CancelTab']/button"));
		alertWithOKCancelButton.click();
		Thread.sleep(5000);
		
		alt = driver.switchTo().alert();
		alt.dismiss(); // It will click on CANCEL button
		
		// Enter Value into JavaScript Alert Textbox
		WebElement alertWithTextboxLeftButton = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertWithTextboxLeftButton.click();
		
		WebElement alertWithTextboxButton = driver.findElement(By.xpath("//*[@id='Textbox']/button"));
		alertWithTextboxButton.click();
		Thread.sleep(5000);
		
		alt = driver.switchTo().alert();
		alt.sendKeys("Selenium WebDriver");
		Thread.sleep(3000);
		// Getting alertbox text
		String alertBoxText = alt.getText();
		System.out.println("Alert Box Text is: "+alertBoxText);
		alt.accept();
		
		// Getting the text of a WebElement
		WebElement getTextElement = driver.findElement(By.xpath("//*[@id='demo1']"));
		String text = getTextElement.getText();
		System.out.println("The text is: "+text);
	}
}
